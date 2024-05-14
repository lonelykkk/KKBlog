package com.kkk.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.kkk.domain.entity.UserEntity;
import com.kkk.mapper.SysUserDao;
import com.kkk.service.SysUserService;
import org.springframework.stereotype.Service;

@Service("sysUserService")
public class SysUserServiceImpl extends ServiceImpl<SysUserDao, UserEntity> implements SysUserService {


}