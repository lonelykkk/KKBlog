package com.kkk.service.impl;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.kkk.domain.entity.LinkEntity;
import com.kkk.mapper.LinkDao;
import com.kkk.service.LinkService;
import org.springframework.stereotype.Service;
import java.util.Map;


@Service("linkService")
public class LinkServiceImpl extends ServiceImpl<LinkDao, LinkEntity> implements LinkService {
}