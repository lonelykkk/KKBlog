package com.kkk.controller;

import com.kkk.common.enums.AppHttpCodeEnum;
import com.kkk.common.utils.BeanCopyUtils;
import com.kkk.common.utils.Result;
import com.kkk.common.utils.SecurityUtils;
import com.kkk.domain.entity.LoginUser;
import com.kkk.domain.entity.SysMenuEntity;
import com.kkk.domain.entity.UserEntity;
import com.kkk.domain.vo.AdminUserInfoVo;
import com.kkk.domain.vo.BlogUserLoginVo;
import com.kkk.domain.vo.RoutersVo;
import com.kkk.domain.vo.UserInfoVo;
import com.kkk.handler.exception.SystemException;
import com.kkk.service.BlogLoginService;
import com.kkk.service.LoginService;
import com.kkk.service.SysMenuService;
import com.kkk.service.SysRoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

/**
 * @author lonelykkk
 * @email 2765314967@qq.com
 * @date 2024/5/13 21:50
 * @Version V1.0
 */
@RestController
public class LoginController {

    @Autowired
    private LoginService loginService;

    @Autowired
    private SysMenuService menuService;

    @Autowired
    private SysRoleService roleService;

    /**
     * 登录校验
     * @param user
     * @return
     */
    @PostMapping("/user/login")
    public Result login(@RequestBody UserEntity user) {
        if (!StringUtils.hasText(user.getUserName())) {
            //提示必须要输入用户名
            throw new SystemException(AppHttpCodeEnum.REQUIRE_USERNAME);
        }
        final Map<String, String> map = loginService.login(user);
        return Result.okResult(map);
    }


    @GetMapping("/getInfo")
    public Result getInfo() {
        //获取当前登录的用户
        LoginUser loginUser = SecurityUtils.getLoginUser();
        //根据用户id查询权限信息
        List<String> perms = menuService.selectPermsByUserId(loginUser.getUser().getId());
        //根据用户id查询角色信息
        List<String> roleKeyList = roleService.selectRoleKeyByUserId(loginUser.getUser().getId());

        //获取用户信息
        UserEntity user = loginUser.getUser();
        UserInfoVo userInfoVo = BeanCopyUtils.copyBean(user, UserInfoVo.class);
        //封装数据返回

        AdminUserInfoVo adminUserInfoVo = new AdminUserInfoVo(perms,roleKeyList,userInfoVo);
        return Result.okResult(adminUserInfoVo);
    }

    @GetMapping("/getRouters")
    public Result<RoutersVo> getRouters(){
        Long userId = SecurityUtils.getUserId();
        //查询menu 结果是tree的形式
        List<SysMenuEntity> menus = menuService.selectRouterMenuTreeByUserId(userId);
        //封装数据返回
        return Result.okResult(new RoutersVo(menus));
    }

    @PostMapping("/user/logout")
    public Result logout(){
        return loginService.logout();
    }
}
