package com.kkk.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.kkk.common.utils.BeanCopyUtils;
import com.kkk.domain.dto.HotArticleDto;
import com.kkk.domain.entity.ArticleEntity;
import com.kkk.domain.entity.CategoryEntity;
import com.kkk.domain.vo.ArticleListVo;
import com.kkk.domain.vo.ArticleVo;
import com.kkk.domain.vo.PageVo;
import com.kkk.mapper.ArticleDao;
import com.kkk.service.ArticleService;
import com.kkk.service.CategoryService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;


@Service
public class ArticleServiceImpl extends ServiceImpl<ArticleDao, ArticleEntity> implements ArticleService {


    @Autowired
    private CategoryService categoryService;

    /**
     * 查询热门文章
     * @return
     */
    @Override
    public List hotArticleList() {
        LambdaQueryWrapper<ArticleEntity> qw = new LambdaQueryWrapper<>();
        //查询是否为正式文章，0代表正式文章，1为草稿
        qw.eq(ArticleEntity::getStatus, 0);
        //根据浏览量进行降序排序
        qw.orderByDesc(ArticleEntity::getViewCount);

        //进行分页查询，只显示浏览量前10的文章
        Page page = new Page<ArticleEntity>(1, 10);
        page(page, qw);

        //对返回给前端的数据进行封装
        final List<ArticleEntity> articles = page.getRecords();
        List<HotArticleDto> articleDtos = new ArrayList<>();
        //属性拷贝
        for (ArticleEntity article : articles) {
            final HotArticleDto hotArticleDto = new HotArticleDto();
            BeanUtils.copyProperties(article, hotArticleDto);
            articleDtos.add(hotArticleDto);
        }
        return articleDtos;
    }

    /**
     * 分页查询文章列表
     *
     * @param pageNum
     * @param pageSize
     * @param categoryId
     * @return
     */
    @Override
    public PageVo articleList(Integer pageNum, Integer pageSize, Long categoryId) {
        final LambdaQueryWrapper<ArticleEntity> qw = new LambdaQueryWrapper();
        //必须是正式文章
        qw.eq(ArticleEntity::getStatus, 0);

        qw.eq(Objects.nonNull(categoryId)&&categoryId>0 ,ArticleEntity::getCategoryId,categoryId);
        qw.orderByDesc(ArticleEntity::getIsTop);
        qw.orderByDesc(ArticleEntity::getViewCount);

        Page<ArticleEntity> pageArticle = new Page<>(pageNum, pageSize);
        this.page(pageArticle, qw);

        final List<ArticleEntity> articles = pageArticle.getRecords();

        //获取文章分类名称
        for (ArticleEntity article : articles) {
            CategoryEntity categoryEntity = categoryService.getById(article.getCategoryId());
            article.setCategoryName(categoryEntity.getName());
        }
        //分装查询结果
        List<ArticleListVo> articleListVos = BeanCopyUtils.copyBeanList(articles, ArticleListVo.class);

        final PageVo pageVo = new PageVo(articleListVos, pageArticle.getTotal());
        return pageVo;
    }

    /**
     * 查看文章详情
     *
     * @param id
     * @return
     */
    @Override
    public ArticleVo getArticleDetail(Long id) {
        final ArticleEntity article = getById(id);
        //查询分类名称
        final CategoryEntity category = categoryService.getById(article.getCategoryId());
        //写入分类名称
        if (category.getName() != null) {
            article.setCategoryName(category.getName());
        }
        //属性拷贝
        final ArticleVo articleVo = BeanCopyUtils.copyBean(article, ArticleVo.class);

        return articleVo;
    }
}