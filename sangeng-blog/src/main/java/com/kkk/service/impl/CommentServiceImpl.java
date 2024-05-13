package com.kkk.service.impl;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.kkk.domain.entity.CommentEntity;
import com.kkk.mapper.CommentDao;
import com.kkk.service.CommentService;
import org.springframework.stereotype.Service;
import java.util.Map;

@Service("commentService")
public class CommentServiceImpl extends ServiceImpl<CommentDao, CommentEntity> implements CommentService {


}