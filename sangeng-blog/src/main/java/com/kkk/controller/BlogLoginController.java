package com.kkk.controller;

import com.kkk.common.enums.AppHttpCodeEnum;
import com.kkk.common.utils.Result;
import com.kkk.domain.entity.UserEntity;
import com.kkk.domain.vo.BlogUserLoginVo;
import com.kkk.handler.exception.SystemException;
import com.kkk.service.BlogLoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author lonelykkk
 * @email 2765314967@qq.com
 * @date 2024/5/13 21:50
 * @Version V1.0
 */
@RestController
@RequestMapping
public class BlogLoginController {

    @Autowired
    private BlogLoginService blogLoginService;

    /**
     * 登录校验
     * @param user
     * @return
     */
    @PostMapping("/login")
    public Result login(@RequestBody UserEntity user) {
        if (!StringUtils.hasText(user.getUserName())) {
            //提示必须要输入用户名
            throw new SystemException(AppHttpCodeEnum.REQUIRE_USERNAME);
        }
        BlogUserLoginVo vo = blogLoginService.login(user);
        return Result.okResult(vo);
    }

    @PostMapping("/logout")
    public Result logout() {
        blogLoginService.logout();
        return Result.okResult();
    }
}
