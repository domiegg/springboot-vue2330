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


import com.dao.RemaixifuDao;
import com.entity.RemaixifuEntity;
import com.service.RemaixifuService;
import com.entity.vo.RemaixifuVO;
import com.entity.view.RemaixifuView;

@Service("remaixifuService")
public class RemaixifuServiceImpl extends ServiceImpl<RemaixifuDao, RemaixifuEntity> implements RemaixifuService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<RemaixifuEntity> page = this.selectPage(
                new Query<RemaixifuEntity>(params).getPage(),
                new EntityWrapper<RemaixifuEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<RemaixifuEntity> wrapper) {
		  Page<RemaixifuView> page =new Query<RemaixifuView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<RemaixifuVO> selectListVO(Wrapper<RemaixifuEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public RemaixifuVO selectVO(Wrapper<RemaixifuEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<RemaixifuView> selectListView(Wrapper<RemaixifuEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public RemaixifuView selectView(Wrapper<RemaixifuEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
