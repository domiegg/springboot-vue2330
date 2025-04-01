package com.dao;

import com.entity.FuzhuangkuanshiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.FuzhuangkuanshiVO;
import com.entity.view.FuzhuangkuanshiView;


/**
 * 服装款式
 * 
 * @author 
 * @email 
 * @date 2023-03-07 22:24:10
 */
public interface FuzhuangkuanshiDao extends BaseMapper<FuzhuangkuanshiEntity> {
	
	List<FuzhuangkuanshiVO> selectListVO(@Param("ew") Wrapper<FuzhuangkuanshiEntity> wrapper);
	
	FuzhuangkuanshiVO selectVO(@Param("ew") Wrapper<FuzhuangkuanshiEntity> wrapper);
	
	List<FuzhuangkuanshiView> selectListView(@Param("ew") Wrapper<FuzhuangkuanshiEntity> wrapper);

	List<FuzhuangkuanshiView> selectListView(Pagination page,@Param("ew") Wrapper<FuzhuangkuanshiEntity> wrapper);
	
	FuzhuangkuanshiView selectView(@Param("ew") Wrapper<FuzhuangkuanshiEntity> wrapper);
	

}
