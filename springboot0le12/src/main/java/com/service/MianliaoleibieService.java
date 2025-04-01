package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.MianliaoleibieEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.MianliaoleibieVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.MianliaoleibieView;


/**
 * 面料类别
 *
 * @author 
 * @email 
 * @date 2023-03-07 22:24:10
 */
public interface MianliaoleibieService extends IService<MianliaoleibieEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<MianliaoleibieVO> selectListVO(Wrapper<MianliaoleibieEntity> wrapper);
   	
   	MianliaoleibieVO selectVO(@Param("ew") Wrapper<MianliaoleibieEntity> wrapper);
   	
   	List<MianliaoleibieView> selectListView(Wrapper<MianliaoleibieEntity> wrapper);
   	
   	MianliaoleibieView selectView(@Param("ew") Wrapper<MianliaoleibieEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<MianliaoleibieEntity> wrapper);
   	

}

