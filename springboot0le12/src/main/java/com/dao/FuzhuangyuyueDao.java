package com.dao;

import com.entity.FuzhuangyuyueEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.FuzhuangyuyueVO;
import com.entity.view.FuzhuangyuyueView;


/**
 * 服装预约
 * 
 * @author 
 * @email 
 * @date 2023-03-07 22:24:10
 */
public interface FuzhuangyuyueDao extends BaseMapper<FuzhuangyuyueEntity> {
	
	List<FuzhuangyuyueVO> selectListVO(@Param("ew") Wrapper<FuzhuangyuyueEntity> wrapper);
	
	FuzhuangyuyueVO selectVO(@Param("ew") Wrapper<FuzhuangyuyueEntity> wrapper);
	
	List<FuzhuangyuyueView> selectListView(@Param("ew") Wrapper<FuzhuangyuyueEntity> wrapper);

	List<FuzhuangyuyueView> selectListView(Pagination page,@Param("ew") Wrapper<FuzhuangyuyueEntity> wrapper);
	
	FuzhuangyuyueView selectView(@Param("ew") Wrapper<FuzhuangyuyueEntity> wrapper);
	

}
