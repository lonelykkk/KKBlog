package com.kkk.mapper;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.kkk.domain.entity.ArticleEntity;
import org.apache.ibatis.annotations.Mapper;

/**
 * 文章表
 * 
 * @author lonelykkk
 * @email 2765314967@qq.com
 * @date 2024-05-11 11:18:37
 */
@Mapper
public interface ArticleDao extends BaseMapper<ArticleEntity> {
	
}
