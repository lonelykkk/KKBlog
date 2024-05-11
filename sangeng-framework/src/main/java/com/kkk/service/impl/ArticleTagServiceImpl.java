package com.kkk.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.kkk.domain.entity.ArticleTagEntity;
import com.kkk.mapper.ArticleTagDao;
import com.kkk.service.ArticleTagService;
import org.springframework.stereotype.Service;


@Service("articleTagService")
public class ArticleTagServiceImpl extends ServiceImpl<ArticleTagDao, ArticleTagEntity> implements ArticleTagService {


}