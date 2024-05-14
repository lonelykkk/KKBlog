package com.kkk.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.kkk.domain.entity.CommentEntity;
import com.kkk.domain.vo.PageVo;

/**
 * 评论表
 *
 * @author lonelykkk
 * @email 2765314967@qq.com
 * @date 2024-05-11 09:06:25
 */
public interface CommentService extends IService<CommentEntity> {
    PageVo commentList(Long articleId, Integer pageNum, Integer pageSize);
}

