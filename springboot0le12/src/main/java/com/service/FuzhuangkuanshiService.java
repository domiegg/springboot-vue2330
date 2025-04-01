package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.FuzhuangkuanshiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.FuzhuangkuanshiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.FuzhuangkuanshiView;


/**
 * 服装款式
 *
 * @author 
 * @email 
 * @date 2023-03-07 22:24:10
 */
public interface FuzhuangkuanshiService extends IService<FuzhuangkuanshiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<FuzhuangkuanshiVO> selectListVO(Wrapper<FuzhuangkuanshiEntity> wrapper);
   	
   	FuzhuangkuanshiVO selectVO(@Param("ew") Wrapper<FuzhuangkuanshiEntity> wrapper);
   	
   	List<FuzhuangkuanshiView> selectListView(Wrapper<FuzhuangkuanshiEntity> wrapper);
   	
   	FuzhuangkuanshiView selectView(@Param("ew") Wrapper<FuzhuangkuanshiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<FuzhuangkuanshiEntity> wrapper);
   	

}

