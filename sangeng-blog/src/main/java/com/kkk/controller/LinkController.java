package com.kkk.controller;

import com.kkk.common.utils.Result;
import com.kkk.domain.entity.LinkEntity;
import com.kkk.service.LinkService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/** 友链
 * @author lonelykkk
 * @email 2765314967@qq.com
 * @date 2024/5/13 21:20
 * @Version V1.0
 */
@RestController
@RequestMapping("/link")
public class LinkController {

    @Autowired
    private LinkService linkService;

    /**
     * 查询友链列表
     * @return
     */
    @GetMapping("/getAllLink")
    public Result getAllLink() {
        final List<LinkEntity> linkEntityList = linkService.list();
        return Result.okResult(linkEntityList);
    }
}
