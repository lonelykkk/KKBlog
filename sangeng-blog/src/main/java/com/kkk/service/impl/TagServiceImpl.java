package com.kkk.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.kkk.domain.entity.TagEntity;
import com.kkk.mapper.TagDao;
import com.kkk.service.TagService;
import org.springframework.stereotype.Service;
import java.util.Map;


@Service("tagService")
public class TagServiceImpl extends ServiceImpl<TagDao, TagEntity> implements TagService {


}