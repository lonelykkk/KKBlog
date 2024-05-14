package com.kkk.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.kkk.domain.entity.SysRoleEntity;
import com.kkk.mapper.SysRoleDao;
import com.kkk.service.SysRoleService;
import org.springframework.stereotype.Service;

@Service("sysRoleService")
public class SysRoleServiceImpl extends ServiceImpl<SysRoleDao, SysRoleEntity> implements SysRoleService {


}