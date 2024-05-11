package com.kkk.domain.entity;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 分类表
 * 
 * @author lonelykkk
 * @email 2765314967@qq.com
 * @date 2024-05-11 09:06:25
 */
@Data
@TableName("sg_category")
public class CategoryEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 
	 */
	@TableId
	private Long id;
	/**
	 * 分类名
	 */
	private String name;
	/**
	 * 父分类id，如果没有父分类为-1
	 */
	private Long pid;
	/**
	 * 描述
	 */
	private String description;
	/**
	 * 状态0:正常,1禁用
	 */
	private String status;
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
