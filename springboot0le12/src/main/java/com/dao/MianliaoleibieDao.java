package com.dao;

import com.entity.MianliaoleibieEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.MianliaoleibieVO;
import com.entity.view.MianliaoleibieView;


/**
 * 面料类别
 * 
 * @author 
 * @email 
 * @date 2023-03-07 22:24:10
 */
public interface MianliaoleibieDao extends BaseMapper<MianliaoleibieEntity> {
	
	List<MianliaoleibieVO> selectListVO(@Param("ew") Wrapper<MianliaoleibieEntity> wrapper);
	
	MianliaoleibieVO selectVO(@Param("ew") Wrapper<MianliaoleibieEntity> wrapper);
	
	List<MianliaoleibieView> selectListView(@Param("ew") Wrapper<MianliaoleibieEntity> wrapper);

	List<MianliaoleibieView> selectListView(Pagination page,@Param("ew") Wrapper<MianliaoleibieEntity> wrapper);
	
	MianliaoleibieView selectView(@Param("ew") Wrapper<MianliaoleibieEntity> wrapper);
	

}
