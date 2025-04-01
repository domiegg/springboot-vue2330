package com.dao;

import com.entity.DiscussremaixifuEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.DiscussremaixifuVO;
import com.entity.view.DiscussremaixifuView;


/**
 * 热卖西服评论表
 * 
 * @author 
 * @email 
 * @date 2023-03-07 22:24:10
 */
public interface DiscussremaixifuDao extends BaseMapper<DiscussremaixifuEntity> {
	
	List<DiscussremaixifuVO> selectListVO(@Param("ew") Wrapper<DiscussremaixifuEntity> wrapper);
	
	DiscussremaixifuVO selectVO(@Param("ew") Wrapper<DiscussremaixifuEntity> wrapper);
	
	List<DiscussremaixifuView> selectListView(@Param("ew") Wrapper<DiscussremaixifuEntity> wrapper);

	List<DiscussremaixifuView> selectListView(Pagination page,@Param("ew") Wrapper<DiscussremaixifuEntity> wrapper);
	
	DiscussremaixifuView selectView(@Param("ew") Wrapper<DiscussremaixifuEntity> wrapper);
	

}
