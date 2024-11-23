package com.kkk.controller;

import com.kkk.common.utils.Result;
import com.kkk.domain.dto.UserDto;
import com.kkk.domain.entity.SysRoleEntity;
import com.kkk.domain.vo.PageVo;
import com.kkk.domain.vo.UserVo;
import com.kkk.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author lonelykkk
 * @email 2765314967@qq.com
 * @date 2024/5/18 17:52
 * @Version V1.0
 */
@RestController
@RequestMapping("system/user")
public class UserController {
    @Autowired
    private UserService userService;

    /**
     * 分页查询用户列表
     * @param pageNum
     * @param pageSize
     * @param userName
     * @param phonenumber
     * @param status
     * @return
     */
    @GetMapping("/list")
    public Result list(Integer pageNum, Integer pageSize, String userName, String phonenumber, String status) {
        PageVo pageVo = userService.userList(pageNum, pageSize, userName, phonenumber, status);
        return Result.okResult(pageVo);
    }

    /**
     * 新增用户
     * @param userVo
     * @return
     */
    @PostMapping
    public Result addUser(@RequestBody UserVo userVo) {
        userService.addUser(userVo);
        return Result.okResult();
    }

    /**
     * 删除用户
     * @param id
     * @return
     */
    @DeleteMapping("/{id}")
    public Result delUser(@PathVariable Long id) {
        userService.removeById(id);
        return Result.okResult();
    }

    /**
     * 根据id查询用户角色信息
     * @param id
     * @return
     */
    @GetMapping("/{id}")
    public Result getUserById(@PathVariable Long id) {
        UserDto userDto = userService.getUserById(id);
        return Result.okResult(userDto);
    }

    @PutMapping
    public Result updateUser(@RequestBody UserVo userVo) {
        userService.updateUser(userVo);
        return Result.okResult();
    }
}
