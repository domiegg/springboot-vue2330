package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.DiscussremaixifuEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.DiscussremaixifuVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.DiscussremaixifuView;


/**
 * 热卖西服评论表
 *
 * @author 
 * @email 
 * @date 2023-03-07 22:24:10
 */
public interface DiscussremaixifuService extends IService<DiscussremaixifuEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<DiscussremaixifuVO> selectListVO(Wrapper<DiscussremaixifuEntity> wrapper);
   	
   	DiscussremaixifuVO selectVO(@Param("ew") Wrapper<DiscussremaixifuEntity> wrapper);
   	
   	List<DiscussremaixifuView> selectListView(Wrapper<DiscussremaixifuEntity> wrapper);
   	
   	DiscussremaixifuView selectView(@Param("ew") Wrapper<DiscussremaixifuEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<DiscussremaixifuEntity> wrapper);
   	

}

