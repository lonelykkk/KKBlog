package com.kkk.controller;

import com.kkk.common.utils.Result;
import com.kkk.domain.entity.CommentEntity;
import com.kkk.domain.vo.CommentVo;
import com.kkk.domain.vo.PageVo;
import com.kkk.service.CommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author lonelykkk
 * @email 2765314967@qq.com
 * @date 2024/5/14 19:36
 * @Version V1.0
 */
@RestController
@RequestMapping("/comment")
public class CommentController {

    @Autowired
    private CommentService commentService;

    @GetMapping("/commentList")
    public Result commentList(Long articleId, Integer pageNum, Integer pageSize){
        PageVo pageVo = commentService.commentList(articleId, pageNum, pageSize);
        return Result.okResult(pageVo);
    }


}
