package com.kkk.mapper;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.kkk.domain.entity.LinkEntity;
import org.apache.ibatis.annotations.Mapper;

/**
 * 友链
 * 
 * @author lonelykkk
 * @email 2765314967@qq.com
 * @date 2024-05-11 09:06:25
 */
@Mapper
public interface LinkDao extends BaseMapper<LinkEntity> {
	
}
