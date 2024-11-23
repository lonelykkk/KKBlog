package com.kkk.controller;

import com.kkk.common.utils.Result;
import com.kkk.domain.entity.CategoryEntity;
import com.kkk.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author lonelykkk
 * @email 2765314967@qq.com
 * @date 2024/5/11 21:45
 * @Version V1.0
 */
@RestController
@RequestMapping("/category")
public class CategoryController {

    @Autowired
    private CategoryService categoryService;

    /**
     * 查询所有分类接口
     * @return
     */
    @GetMapping("/getCategoryList")
    public Result getCategoryList() {
        //final List<CategoryEntity> categoryEntities = categoryService.list();


        //代码优化
        List<CategoryEntity> categoryEntities = categoryService.getCategoryList();
        return Result.okResult(categoryEntities);
    }

}
