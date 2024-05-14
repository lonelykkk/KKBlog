package com.kkk.service.impl;
import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.kkk.common.utils.BeanCopyUtils;
import com.kkk.domain.entity.CommentEntity;
import com.kkk.domain.vo.CommentVo;
import com.kkk.domain.vo.PageVo;
import com.kkk.mapper.CommentDao;
import com.kkk.mapper.SysUserDao;
import com.kkk.service.CommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("commentService")
public class CommentServiceImpl extends ServiceImpl<CommentDao, CommentEntity> implements CommentService {


    @Autowired
    private SysUserDao userDao;

    @Autowired
    private CommentService commentService;
    @Override
    public PageVo commentList(Long articleId, Integer pageNum, Integer pageSize) {

        final LambdaQueryWrapper<CommentEntity> qw = new LambdaQueryWrapper<>();
        qw.eq(CommentEntity::getArticleId, articleId);
        //查询所有根评论
        qw.eq(CommentEntity::getRootId, -1);
        Page<CommentEntity> page = new Page<>(pageNum, pageSize);

        final Page<CommentEntity> commentEntityPage = this.page(page, qw);
        final List<CommentEntity> records = commentEntityPage.getRecords();
        final List<CommentVo> commentVos = toCommentVoList(records);
        for (CommentVo commentVo : commentVos) {
            final List<CommentVo> children = getChildren(commentVo.getId());
            commentVo.setChildren(children);
        }

        return new PageVo(commentVos, page.getTotal());
    }

    /**
     * 查询所有根评论并封装响应给前端的vo
     * @param list
     * @return
     */
    private List<CommentVo> toCommentVoList(List<CommentEntity> list) {
        List<CommentVo> commentVos = BeanCopyUtils.copyBeanList(list, CommentVo.class);
        for (CommentVo commentVo : commentVos) {
            String nickName = userDao.selectById(commentVo.getCreateBy()).getNickName();
            commentVo.setUsername(nickName);
            
            //通过toCommentUserId查询用户的昵称并赋值
            //如果toCommentUserId不为-1才进行查询
            if (commentVo.getToCommentId() != -1) {
                final String toCommentUserName = userDao.selectById(commentVo.getToCommentUserId()).getNickName();
                commentVo.setToCommentUserName(toCommentUserName);
            }
        }
        return commentVos;
    }

    private List<CommentVo> getChildren(Long id) {
        final LambdaQueryWrapper<CommentEntity> qw = new LambdaQueryWrapper<>();
        qw.eq(CommentEntity::getRootId, id);
        qw.orderByDesc(CommentEntity::getCreateTime);
        final List<CommentEntity> commentEntities = list(qw);
        final List<CommentVo> commentVos = toCommentVoList(commentEntities);
        return commentVos;
    }
 }