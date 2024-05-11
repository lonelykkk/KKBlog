package com.kkk.domain.entity;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 角色和菜单关联表
 * 
 * @author lonelykkk
 * @email 2765314967@qq.com
 * @date 2024-05-11 09:06:25
 */
@Data
@TableName("sys_role_menu")
public class SysRoleMenuEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 角色ID
	 */
	@TableId
	private Long roleId;
	/**
	 * 菜单ID
	 */
	private Long menuId;

}
