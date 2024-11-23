package com.kkk.domain.entity;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 文章表
 * 
 * @author lonelykkk
 * @email 2765314967@qq.com
 * @date 2024-05-11 11:18:37
 */
@Data
@TableName("sg_article")
public class ArticleEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 
	 */
	@TableId
	private Long id;
	/**
	 * 标题
	 */
	private String title;
	/**
	 * 文章内容
	 */
	private String content;
	/**
	 * 文章摘要
	 */
	private String summary;
	@TableField(exist = false)
	private String categoryName;
	/**
	 * 所属分类id
	 */
	private Long categoryId;
	/**
	 * 缩略图
	 */
	private String thumbnail;
	/**
	 * 是否置顶（0否，1是）
	 */
	private String isTop;
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
	 * 
	 */
	private Long createBy;
	/**
	 * 
	 */
	private Date createTime;
	/**
	 * 
	 */
	private Long updateBy;
	/**
	 * 
	 */
	private Date updateTime;
	/**
	 * 删除标志（0代表未删除，1代表已删除）
	 */
	private Integer delFlag;

}
