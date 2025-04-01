package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.FuzhuangyuyueEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.FuzhuangyuyueVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.FuzhuangyuyueView;


/**
 * 服装预约
 *
 * @author 
 * @email 
 * @date 2023-03-07 22:24:10
 */
public interface FuzhuangyuyueService extends IService<FuzhuangyuyueEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<FuzhuangyuyueVO> selectListVO(Wrapper<FuzhuangyuyueEntity> wrapper);
   	
   	FuzhuangyuyueVO selectVO(@Param("ew") Wrapper<FuzhuangyuyueEntity> wrapper);
   	
   	List<FuzhuangyuyueView> selectListView(Wrapper<FuzhuangyuyueEntity> wrapper);
   	
   	FuzhuangyuyueView selectView(@Param("ew") Wrapper<FuzhuangyuyueEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<FuzhuangyuyueEntity> wrapper);
   	

}

