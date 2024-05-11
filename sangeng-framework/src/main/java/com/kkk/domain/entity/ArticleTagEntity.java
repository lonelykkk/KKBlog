package com.kkk.domain.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 文章标签关联表
 * 
 * @author lonelykkk
 * @email 2765314967@qq.com
 * @date 2024-05-11 09:06:25
 */
@Data
@TableName("sg_article_tag")
public class ArticleTagEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 文章id
	 */
	@TableId
	private Long articleId;
	/**
	 * 标签id
	 */
	private Long tagId;

}
