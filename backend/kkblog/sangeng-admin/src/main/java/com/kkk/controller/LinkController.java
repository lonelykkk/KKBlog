package com.kkk.controller;

import com.kkk.common.utils.Result;
import com.kkk.domain.entity.LinkEntity;
import com.kkk.domain.vo.PageVo;
import com.kkk.service.LinkService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @author lonelykkk
 * @email 2765314967@qq.com
 * @date 2024/5/18 20:43
 * @Version V1.0
 */
@RestController
@RequestMapping("/content/link")
public class LinkController {

    @Autowired
    private LinkService linkService;

    /**
     * 分页查询友链
     * @param pageNum
     * @param pageSize
     * @param name
     * @param status
     * @return
     */
    @GetMapping("/list")
    public Result list(Integer pageNum, Integer pageSize, String name, String status) {
        PageVo pageVo = linkService.pageList(pageNum, pageSize, name, status);
        return Result.okResult(pageVo);
    }

    /**
     * 新增友链
     * @param link
     * @return
     */
    @PostMapping
    public Result addLink(@RequestBody LinkEntity link) {
        linkService.save(link);
        return Result.okResult();
    }

    /**
     * 根据id查询友链
     * @param id
     * @return
     */
    @GetMapping("/{id}")
    public Result getLinkById(@PathVariable Long id) {
        LinkEntity link = linkService.getById(id);
        return Result.okResult(link);
    }

    /**
     * 修改友链
     * @param link
     * @return
     */
    @PutMapping
    public Result updateLink(@RequestBody LinkEntity link) {
        linkService.updateLink(link);
        return Result.okResult();
    }

    /**
     * 删除友链
     * @param id
     * @return
     */
    @DeleteMapping("/{id}")
    public Result delLink(@PathVariable Long id) {
        linkService.removeById(id);
        return Result.okResult();
    }
}
