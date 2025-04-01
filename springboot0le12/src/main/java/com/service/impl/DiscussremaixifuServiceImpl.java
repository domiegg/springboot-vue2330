package com.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.List;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.utils.PageUtils;
import com.utils.Query;


import com.dao.DiscussremaixifuDao;
import com.entity.DiscussremaixifuEntity;
import com.service.DiscussremaixifuService;
import com.entity.vo.DiscussremaixifuVO;
import com.entity.view.DiscussremaixifuView;

@Service("discussremaixifuService")
public class DiscussremaixifuServiceImpl extends ServiceImpl<DiscussremaixifuDao, DiscussremaixifuEntity> implements DiscussremaixifuService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<DiscussremaixifuEntity> page = this.selectPage(
                new Query<DiscussremaixifuEntity>(params).getPage(),
                new EntityWrapper<DiscussremaixifuEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<DiscussremaixifuEntity> wrapper) {
		  Page<DiscussremaixifuView> page =new Query<DiscussremaixifuView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<DiscussremaixifuVO> selectListVO(Wrapper<DiscussremaixifuEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public DiscussremaixifuVO selectVO(Wrapper<DiscussremaixifuEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<DiscussremaixifuView> selectListView(Wrapper<DiscussremaixifuEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public DiscussremaixifuView selectView(Wrapper<DiscussremaixifuEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
