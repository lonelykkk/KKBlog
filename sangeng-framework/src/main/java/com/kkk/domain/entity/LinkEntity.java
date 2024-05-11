package com.kkk.domain.entity;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 友链
 * 
 * @author lonelykkk
 * @email 2765314967@qq.com
 * @date 2024-05-11 09:06:25
 */
@Data
@TableName("sg_link")
public class LinkEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 
	 */
	@TableId
	private Long id;
	/**
	 * 
	 */
	private String name;
	/**
	 * 
	 */
	private String logo;
	/**
	 * 
	 */
	private String description;
	/**
	 * 网站地址
	 */
	private String address;
	/**
	 * 审核状态 (0代表审核通过，1代表审核未通过，2代表未审核)
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