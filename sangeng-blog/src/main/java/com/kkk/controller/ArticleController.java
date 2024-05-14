package com.kkk.controller;

import com.kkk.common.utils.Result;
import com.kkk.domain.dto.HotArticleDto;
import com.kkk.domain.entity.ArticleEntity;
import com.kkk.domain.vo.ArticleVo;
import com.kkk.domain.vo.PageVo;
import com.kkk.service.ArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author lonelykkk
 * @email 2765314967@qq.com
 * @date 2024/5/11 11:10
 * @Version V1.0
 */

@RestController
@RequestMapping("/article")
public class ArticleController {

    @Autowired
    private ArticleService articleService;

    /**
     * 分页查询文章列表
     * @param pageNum
     * @param pageSize
     * @param categoryId
     * @return
     */
    @GetMapping("/articleList")
    public Result articleList(Integer pageNum,Integer pageSize,Long categoryId) {
        PageVo pageVo = articleService.articleList(pageNum, pageSize, categoryId);
        return Result.okResult(pageVo);
    }

    /**
     * 查询热门文章
     * @return
     */
    @GetMapping("/hotArticleList")
    public Result<HotArticleDto> hotArticleList() {
        List<ArticleEntity> hotArticleList = articleService.hotArticleList();
        return Result.okResult(hotArticleList);
    }

    @GetMapping("/{id}")
    public Result getArticleDetail(@PathVariable Long id) {
        final ArticleVo articleVo = articleService.getArticleDetail(id);
        return Result.okResult(articleVo);
    }
}
