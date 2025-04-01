package com.dao;

import com.entity.RemaixifuEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.RemaixifuVO;
import com.entity.view.RemaixifuView;


/**
 * 热卖西服
 * 
 * @author 
 * @email 
 * @date 2023-03-07 22:24:10
 */
public interface RemaixifuDao extends BaseMapper<RemaixifuEntity> {
	
	List<RemaixifuVO> selectListVO(@Param("ew") Wrapper<RemaixifuEntity> wrapper);
	
	RemaixifuVO selectVO(@Param("ew") Wrapper<RemaixifuEntity> wrapper);
	
	List<RemaixifuView> selectListView(@Param("ew") Wrapper<RemaixifuEntity> wrapper);

	List<RemaixifuView> selectListView(Pagination page,@Param("ew") Wrapper<RemaixifuEntity> wrapper);
	
	RemaixifuView selectView(@Param("ew") Wrapper<RemaixifuEntity> wrapper);
	

}
