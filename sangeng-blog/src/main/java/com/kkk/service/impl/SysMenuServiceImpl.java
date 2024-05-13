package com.kkk.service.impl;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.kkk.domain.entity.SysMenuEntity;
import com.kkk.mapper.SysMenuDao;
import com.kkk.service.SysMenuService;
import org.springframework.stereotype.Service;
import java.util.Map;


@Service("sysMenuService")
public class SysMenuServiceImpl extends ServiceImpl<SysMenuDao, SysMenuEntity> implements SysMenuService {

}