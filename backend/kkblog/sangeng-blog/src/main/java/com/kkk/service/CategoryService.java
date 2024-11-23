package com.kkk.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.kkk.domain.entity.CategoryEntity;

import java.util.List;
import java.util.Map;

/**
 * 分类表
 *
 * @author lonelykkk
 * @email 2765314967@qq.com
 * @date 2024-05-11 09:06:25
 */
public interface CategoryService extends IService<CategoryEntity> {
    List<CategoryEntity> getCategoryList();
}

