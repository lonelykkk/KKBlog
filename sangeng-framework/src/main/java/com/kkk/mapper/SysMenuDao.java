package com.kkk.mapper;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.kkk.domain.entity.SysMenuEntity;
import org.apache.ibatis.annotations.Mapper;

/**
 * 菜单权限表
 * 
 * @author lonelykkk
 * @email 2765314967@qq.com
 * @date 2024-05-11 09:06:25
 */
@Mapper
public interface SysMenuDao extends BaseMapper<SysMenuEntity> {
	
}
