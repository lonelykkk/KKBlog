package com.kkk.mapper;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.kkk.domain.entity.SysRoleEntity;
import org.apache.ibatis.annotations.Mapper;

/**
 * 角色信息表
 * 
 * @author lonelykkk
 * @email 2765314967@qq.com
 * @date 2024-05-11 09:06:25
 */
@Mapper
public interface SysRoleDao extends BaseMapper<SysRoleEntity> {
	
}
