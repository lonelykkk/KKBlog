package com.kkk.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.kkk.domain.entity.LoginUser;
import com.kkk.domain.entity.UserEntity;
import com.kkk.mapper.SysUserDao;
import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.Objects;

/**
 * 创建security中的UserDetailsService的实现类
 * @author lonelykkk
 * @email 2765314967@qq.com
 * @date 2024/5/13 22:07
 * @Version V1.0
 */
@Service
public class UserDetailServiceImpl implements UserDetailsService {

    @Autowired
    private SysUserDao userDao;

    @Override
    public UserDetails loadUserByUsername(String name) throws UsernameNotFoundException {
        final LambdaQueryWrapper<UserEntity> qw = new LambdaQueryWrapper<>();
        qw.eq(UserEntity::getUserName, name);
        final UserEntity user = userDao.selectOne(qw);
        if (Objects.isNull(user)) {
            //如果用户名为空
            throw new RuntimeException("用户不存在");
        }

        //返回用户信息
        //TODO 查询权限信息
        return new LoginUser(user);
    }
}
