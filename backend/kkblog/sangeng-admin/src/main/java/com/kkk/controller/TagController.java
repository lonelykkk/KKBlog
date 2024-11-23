package com.kkk.controller;

import com.kkk.common.utils.Result;
import com.kkk.domain.dto.TagListDto;
import com.kkk.domain.entity.TagEntity;
import com.kkk.domain.vo.PageVo;
import com.kkk.service.TagService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * 标签相关
 * @author lonelykkk
 * @email 2765314967@qq.com
 * @date 2024/5/16 10:17
 * @Version V1.0
 */
@RestController
@RequestMapping("/content/tag")
public class TagController {

    @Autowired
    private TagService tagService;

    /**
     * 标签分页查询
     * @param pageNum
     * @param pageSize
     * @param tagListDto
     * @return
     */
    @GetMapping("/list")
    public Result list(Integer pageNum, Integer pageSize, TagListDto tagListDto) {
        PageVo pageVo = tagService.pageTagList(pageNum, pageSize, tagListDto);
        return Result.okResult(pageVo);
    }

    /**
     * 添加标签
     * @param tagEntity
     * @return
     */
    @PostMapping
    public Result addTag(@RequestBody TagEntity tagEntity) {
        tagService.addTag(tagEntity);
        return Result.okResult();
    }

    /**
     * 删除标签
     * @param id
     * @return
     */
    @DeleteMapping("/{id}")
    public Result deleteTag(@PathVariable Long id) {
        tagService.deleteTag(id);
        return Result.okResult();
    }

    /**
     * 根据id查询标签
     * @param id
     * @return
     */
    @GetMapping("/{id}")
    public Result getTagById(@PathVariable Long id) {
        TagListDto tagListDto = tagService.getTagById(id);
        return Result.okResult(tagListDto);
    }

    /**
     * 修改标签信息
     * @param tagListDto
     * @return
     */
    @PutMapping
    public Result updateTag(@RequestBody TagListDto tagListDto) {
        tagService.updateTag(tagListDto);
        return Result.okResult();
    }

    @GetMapping("/listAllTag")
    public Result listAllTag() {
        List<TagListDto> list = tagService.listAllTag();
        return Result.okResult(list);
    }
}
