package com.kkk.controller;

import com.kkk.common.utils.Result;
import com.kkk.domain.entity.SysRoleEntity;
import com.kkk.domain.vo.PageVo;
import com.kkk.domain.vo.RoleStatusVo;
import com.kkk.service.SysRoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.annotation.security.PermitAll;
import java.util.List;

/**
 * @author lonelykkk
 * @email 2765314967@qq.com
 * @date 2024/5/18 17:16
 * @Version V1.0
 */
@RestController
@RequestMapping("system/role")
public class RoleController {

    @Autowired
    private SysRoleService roleService;

    /**
     * 角色列表分页查询
     * @param pageNum
     * @param pageSize
     * @param roleName
     * @param status
     * @return
     */
    @GetMapping("/list")
    public Result list(Integer pageNum,Integer pageSize,String roleName,String status) {
       PageVo pageVo = roleService.pageList(pageNum, pageSize, roleName, status);
        return Result.okResult(pageVo);
    }

    /**
     * 修改角色状态(启用/停用)
     * @param roleStatusVo
     * @return
     */
    @PutMapping("/changeStatus")
    public Result changeStatus(@RequestBody RoleStatusVo roleStatusVo) {
        roleService.changeStatus(roleStatusVo);
        return Result.okResult();
    }

    /**
     * 根据id删除角色
     * @param id
     * @return
     */
    @DeleteMapping("/{id}")
    public Result delRole(@PathVariable Long id) {
        roleService.removeById(id);
        return Result.okResult();
    }

    /**
     * 查询所有角色列表
     * @return
     */
    @GetMapping("/listAllRole")
    public Result getRoleList() {
        List<SysRoleEntity> roleList = roleService.getRoleList();
        return Result.okResult(roleList);
    }
}
