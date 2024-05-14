package com.kkk.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.kkk.common.utils.BeanCopyUtils;
import com.kkk.common.utils.JwtUtil;
import com.kkk.common.utils.RedisCache;
import com.kkk.domain.entity.LoginUser;
import com.kkk.domain.entity.UserEntity;
import com.kkk.domain.vo.BlogUserLoginVo;
import com.kkk.domain.vo.UserInfoVo;
import com.kkk.mapper.SysUserDao;
import com.kkk.service.BlogLoginService;
import io.jsonwebtoken.Claims;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Service;

import java.util.Objects;

@Service("BlogLoginService")
public class BlogLoginServiceImpl extends ServiceImpl<SysUserDao, UserEntity> implements BlogLoginService {

    @Autowired
    private AuthenticationManager authenticationManager;

    @Autowired
    private RedisCache redisCache;

    @Override
    public BlogUserLoginVo login(UserEntity user) {
        //没登录时传入参数用户名和密码
        UsernamePasswordAuthenticationToken authenticationToken = new UsernamePasswordAuthenticationToken(user.getUserName(), user.getPassword());
        //将封装好的authenticationToken传入获取Authentication对象
        Authentication authenticate = authenticationManager.authenticate(authenticationToken);
        //判断是否认证通过
        if (Objects.isNull(authenticate)) {
            throw new RuntimeException("用户名密码错误");
        }
        //获取用户id生成jwt/token
        LoginUser loginUser = (LoginUser) authenticate.getPrincipal();
        String userId = loginUser.getUser().getId().toString();
        final String jwt = JwtUtil.createJWT(userId);
        //把用户信息存入redis
        redisCache.setCacheObject("bloglogin:" + userId, loginUser);

        final UserInfoVo userInfoVo = BeanCopyUtils.copyBean(loginUser.getUser(), UserInfoVo.class);
        //把token和userinfo封装返回
        final BlogUserLoginVo vo = new BlogUserLoginVo(jwt, userInfoVo);
        return vo;
    }

    @Override
    public void logout() {
        //获取token 解析获取userid
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        LoginUser loginUser = (LoginUser) authentication.getPrincipal();
        //获取userid
        Long userId = loginUser.getUser().getId();
        //删除redis中的用户信息
        redisCache.deleteObject("bloglogin:"+userId);
    }
}