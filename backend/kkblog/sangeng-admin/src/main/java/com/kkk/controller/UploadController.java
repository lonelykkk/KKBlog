package com.kkk.controller;

import com.kkk.common.utils.AliOssUtil;
import com.kkk.common.utils.Result;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.UUID;

/**
 * 文件上传
 * @author lonelykkk
 * @email 2765314967@qq.com
 * @date 2024/5/15 9:12
 * @Version V1.0
 */
@RestController
@Slf4j
public class UploadController {
    @Autowired
    private AliOssUtil aliOssUtil;

    /**
     * 上传文件
     * @param img
     * @return
     */
    @PostMapping("/upload")
    public Result upload(MultipartFile img) {
        log.info("file：{}", img);
        try {
            //原始文件名
            String originalFilename = img.getOriginalFilename();
            //截取原始文件名的后缀   dfdfdf.png
            String extension = originalFilename.substring(originalFilename.lastIndexOf("."));
            //构造新文件名称
            String objectName = UUID.randomUUID().toString() + extension;

            //文件的请求路径
            String filePath = aliOssUtil.upload(img.getBytes(), objectName);
            return Result.okResult(filePath);
        } catch (IOException e) {
            log.error("文件上传失败：{}", e);
        }
        return Result.errorResult(507, "文件上传失败");
    }
}
