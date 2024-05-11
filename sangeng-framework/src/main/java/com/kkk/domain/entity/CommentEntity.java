package com.kkk.domain.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 评论表
 * 
 * @author lonelykkk
 * @email 2765314967@qq.com
 * @date 2024-05-11 09:06:25
 */
@Data
@TableName("sg_comment")
public class CommentEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 
	 */
	@TableId
	private Long id;
	/**
	 * 评论类型（0代表文章评论，1代表友链评论）
	 */
	private String type;
	/**
	 * 文章id
	 */
	private Long articleId;
	/**
	 * 根评论id
	 */
	private Long rootId;
	/**
	 * 评论内容
	 */
	private String content;
	/**
	 * 所回复的目标评论的userid
	 */
	private Long toCommentUserId;
	/**
	 * 回复目标评论id
	 */
	private Long toCommentId;
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
