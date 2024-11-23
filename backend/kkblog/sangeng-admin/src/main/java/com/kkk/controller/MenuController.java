package com.kkk.controller;

import com.kkk.common.utils.Result;
import com.kkk.domain.entity.SysMenuEntity;
import com.kkk.service.SysMenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author lonelykkk
 * @email 2765314967@qq.com
 * @date 2024/5/18 16:25
 * @Version V1.0
 */
@RestController
@RequestMapping("/system/menu")
public class MenuController {

    @Autowired
    private SysMenuService menuService;

    /**
     * 查询菜单列表
     * @return
     */
    @GetMapping("/list")
    public Result list() {
        final List<SysMenuEntity> list = menuService.list();
        return Result.okResult(list);
    }

    /**
     * 新增菜单
     * @param menuEntity
     * @return
     */
    @PostMapping
    public Result addMenu(@RequestBody SysMenuEntity menuEntity) {
        menuService.save(menuEntity);
        return Result.okResult();
    }

    /**
     * 根据id查询菜单
     * @param id
     * @return
     */
    @GetMapping("/{id}")
    public Result getMenuById(@PathVariable Long id) {
        final SysMenuEntity menu = menuService.getById(id);
        return Result.okResult(menu);
    }

    @PutMapping
    public Result updateMenu(@RequestBody SysMenuEntity menuEntity) {
        menuService.updateById(menuEntity);
        return Result.okResult();
    }

    @DeleteMapping("/{menuId}")
    public Result delMenu(@PathVariable Long menuId) {
        menuService.delMenu(menuId);
        return Result.okResult();
    }
}
