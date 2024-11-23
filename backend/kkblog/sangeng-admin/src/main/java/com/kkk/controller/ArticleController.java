package com.kkk.controller;

import com.kkk.common.utils.Result;
import com.kkk.domain.dto.AddArticleDto;
import com.kkk.domain.dto.ArticleDto;
import com.kkk.domain.vo.PageVo;
import com.kkk.service.ArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/content/article")
public class ArticleController {

    @Autowired
    private ArticleService articleService;

    /**
     * 写博文
     * @param article
     * @return
     */
    @PostMapping
    public Result add(@RequestBody AddArticleDto article){
        return articleService.add(article);
    }


    /**
     * 分页查询文章列表
     * @param pageNum
     * @param pageSize
     * @param title
     * @param summary
     * @return
     */
    @GetMapping("/list")
    public Result list(Integer pageNum,Integer pageSize,String title,String summary) {
        PageVo pageVo = articleService.adminList(pageSize, pageNum, title, summary);
        return Result.okResult(pageVo);
    }

    /**
     * 根据id查询文章详情
     * @param id
     * @return
     */
    @GetMapping("/{id}")
    public Result getArticleById(@PathVariable Long id) {
        ArticleDto articleDto = articleService.getArticleById(id);
        return Result.okResult(articleDto);
    }

    @PutMapping
    public Result updateArticle(@RequestBody ArticleDto articleDto) {
        articleService.updateArticle(articleDto);
        return Result.okResult();
    }

    @DeleteMapping("/{id}")
    public Result delArticle(@PathVariable Long id) {
        articleService.delArticle(id);
        return Result.okResult();
    }
}