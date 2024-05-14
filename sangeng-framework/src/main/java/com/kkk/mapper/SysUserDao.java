package com.kkk.mapper;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.kkk.domain.entity.UserEntity;
import org.apache.ibatis.annotations.Mapper;

/**
 * 用户表
 * 
 * @author lonelykkk
 * @email 2765314967@qq.com
 * @date 2024-05-11 09:06:25
 */
@Mapper
public interface SysUserDao extends BaseMapper<UserEntity> {
	
}
