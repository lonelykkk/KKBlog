package com.kkk.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.kkk.domain.entity.SysRoleMenuEntity;
import com.kkk.mapper.SysRoleMenuDao;
import com.kkk.service.SysRoleMenuService;
import org.springframework.stereotype.Service;


@Service("sysRoleMenuService")
public class SysRoleMenuServiceImpl extends ServiceImpl<SysRoleMenuDao, SysRoleMenuEntity> implements SysRoleMenuService {

}