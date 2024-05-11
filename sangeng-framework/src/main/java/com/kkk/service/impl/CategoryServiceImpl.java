package com.kkk.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.kkk.domain.entity.CategoryEntity;
import com.kkk.mapper.CategoryDao;
import com.kkk.service.CategoryService;
import org.springframework.stereotype.Service;
import java.util.Map;


@Service("categoryService")
public class CategoryServiceImpl extends ServiceImpl<CategoryDao, CategoryEntity> implements CategoryService {

}