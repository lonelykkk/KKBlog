package com.kkk.domain.vo;

import com.baomidou.mybatisplus.annotation.TableField;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

/**
 * @author lonelykkk
 * @email 2765314967@qq.com
 * @date 2024/5/13 21:02
 * @Version V1.0
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ArticleVo {

    /**
     * 标题
     */
    private String title;
    /**
     * 文章内容
     */
    private String content;

    /**
     * 文章分类名称
     */
    private String categoryName;
    /**
     * 所属分类id
     */
    private Long categoryId;

    /**
     * 状态（0已发布，1草稿）
     */
    private String status;
    /**
     * 访问量
     */
    private Long viewCount;
    /**
     * 是否允许评论 1是，0否
     */
    private String isComment;
    /**
     *创建人
     */
    private Long createBy;
    /**
     *创建时间
     */
    private Date createTime;

}
