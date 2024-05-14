package com.kkk.service;
import com.baomidou.mybatisplus.extension.service.IService;
import com.kkk.domain.entity.ArticleEntity;
import com.kkk.domain.vo.ArticleVo;
import com.kkk.domain.vo.PageVo;

import java.util.List;

/**
 * 文章表
 *
 * @author lonelykkk
 * @email 2765314967@qq.com
 * @date 2024-05-11 11:18:37
 */
public interface ArticleService extends IService<ArticleEntity> {
    List<ArticleEntity> hotArticleList();

    PageVo articleList(Integer pageNum, Integer pageSize, Long categoryId);

    ArticleVo getArticleDetail(Long id);
}

