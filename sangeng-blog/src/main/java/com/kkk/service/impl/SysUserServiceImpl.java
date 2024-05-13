package com.kkk.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.kkk.domain.entity.SysUserEntity;
import com.kkk.mapper.SysUserDao;
import com.kkk.service.SysUserService;
import org.springframework.stereotype.Service;
import java.util.Map;
@Service("sysUserService")
public class SysUserServiceImpl extends ServiceImpl<SysUserDao, SysUserEntity> implements SysUserService {


}