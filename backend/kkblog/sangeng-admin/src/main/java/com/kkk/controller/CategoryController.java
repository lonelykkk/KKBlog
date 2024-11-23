package com.kkk.controller;

import com.alibaba.excel.EasyExcel;
import com.alibaba.fastjson.JSON;
import com.kkk.common.enums.AppHttpCodeEnum;
import com.kkk.common.utils.BeanCopyUtils;
import com.kkk.common.utils.Result;
import com.kkk.common.utils.WebUtils;
import com.kkk.domain.entity.CategoryEntity;
import com.kkk.domain.vo.CategoryVo;
import com.kkk.domain.vo.ExcelCategoryVo;
import com.kkk.domain.vo.PageVo;
import com.kkk.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletResponse;
import java.util.List;

/**
 * @author lonelykkk
 * @email 2765314967@qq.com
 * @date 2024/5/17 15:08
 * @Version V1.0
 */
@RestController
@RequestMapping("/content/category")
public class CategoryController {

    @Autowired
    private CategoryService categoryService;

    /**
     * 查询所有分类
     * @return
     */
    @GetMapping("/listAllCategory")
    public Result listAllCategory(){
        List<CategoryVo> list = categoryService.listAllCategory();
        return Result.okResult(list);
    }

    /**
     * 分类导出
     * @param response
     */
    @GetMapping("/export")
    public void export(HttpServletResponse response){
        try {
            //设置下载文件的请求头
            WebUtils.setDownLoadHeader("分类.xlsx",response);
            //获取需要导出的数据
            List<CategoryEntity> categoryVos = categoryService.list();

            List<ExcelCategoryVo> excelCategoryVos = BeanCopyUtils.copyBeanList(categoryVos, ExcelCategoryVo.class);
            //把数据写入到Excel中
            EasyExcel.write(response.getOutputStream(), ExcelCategoryVo.class).autoCloseStream(Boolean.FALSE).sheet("分类导出")
                    .doWrite(excelCategoryVos);

        } catch (Exception e) {
            //如果出现异常也要响应json
            Result result = Result.errorResult(AppHttpCodeEnum.SYSTEM_ERROR);
            WebUtils.renderString(response, JSON.toJSONString(result));
        }
    }

    /**
     * 获取分类列表
     * @param pageNum
     * @param pageSize
     * @param name
     * @param status
     * @return
     */
    @GetMapping("/list")
    public Result list(Integer pageNum,Integer pageSize,String name,String status) {
        PageVo pageVo = categoryService.pageList(pageNum, pageSize, name, status);
        return Result.okResult(pageVo);
    }

    /**
     * 新增分类
     * @param categoryVo
     * @return
     */
    @PostMapping
    public Result addCategory(@RequestBody CategoryVo categoryVo) {
        categoryService.addCategory(categoryVo);
        return Result.okResult();
    }

    /**
     * 根据id查看分类详情
     * @param id
     * @return
     */
    @GetMapping("/{id}")
    public Result getCategoryById(@PathVariable Long id) {
        CategoryVo categoryVo = categoryService.getCategoryById(id);
        return Result.okResult(categoryVo);
    }

    /**
     * 修改分类
     * @param categoryVo
     * @return
     */
    @PutMapping
    public Result updateCategory(@RequestBody CategoryVo categoryVo) {
        categoryService.updateCategory(categoryVo);
        return Result.okResult();
    }

    /**
     * 删除分类
     * @param id
     * @return
     */
    @DeleteMapping("/{id}")
    public Result delCategory(@PathVariable Long id) {
        categoryService.removeById(id);
        return Result.okResult();
    }
}