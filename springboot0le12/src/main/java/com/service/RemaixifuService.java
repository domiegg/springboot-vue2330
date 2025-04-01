package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.RemaixifuEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.RemaixifuVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.RemaixifuView;


/**
 * 热卖西服
 *
 * @author 
 * @email 
 * @date 2023-03-07 22:24:10
 */
public interface RemaixifuService extends IService<RemaixifuEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<RemaixifuVO> selectListVO(Wrapper<RemaixifuEntity> wrapper);
   	
   	RemaixifuVO selectVO(@Param("ew") Wrapper<RemaixifuEntity> wrapper);
   	
   	List<RemaixifuView> selectListView(Wrapper<RemaixifuEntity> wrapper);
   	
   	RemaixifuView selectView(@Param("ew") Wrapper<RemaixifuEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<RemaixifuEntity> wrapper);
   	

}

