package com.kkk.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.kkk.domain.entity.UserEntity;
import com.kkk.domain.vo.BlogUserLoginVo;

/**
 * 用户表
 *
 * @author lonelykkk
 * @email 2765314967@qq.com
 * @date 2024-05-11 09:06:25
 */
public interface BlogLoginService extends IService<UserEntity> {

    BlogUserLoginVo login(UserEntity user);

    void logout();
}

