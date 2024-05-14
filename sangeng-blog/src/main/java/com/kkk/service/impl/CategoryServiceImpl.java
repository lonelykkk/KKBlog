package com.kkk.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.kkk.domain.entity.CategoryEntity;
import com.kkk.mapper.CategoryDao;
import com.kkk.service.ArticleService;
import com.kkk.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service("categoryService")
public class CategoryServiceImpl extends ServiceImpl<CategoryDao, CategoryEntity> implements CategoryService {

    @Autowired
    private ArticleService articleService;

    /**
     * 查询分类列表
     * @return
     */
    @Override
    public List<CategoryEntity> getCategoryList() {
        /**
         * 将所有分类类型返回
         */

        final long id = Thread.currentThread().getId();
        return list();
    }
}