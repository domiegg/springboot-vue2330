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


import com.dao.FuzhuangkuanshiDao;
import com.entity.FuzhuangkuanshiEntity;
import com.service.FuzhuangkuanshiService;
import com.entity.vo.FuzhuangkuanshiVO;
import com.entity.view.FuzhuangkuanshiView;

@Service("fuzhuangkuanshiService")
public class FuzhuangkuanshiServiceImpl extends ServiceImpl<FuzhuangkuanshiDao, FuzhuangkuanshiEntity> implements FuzhuangkuanshiService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<FuzhuangkuanshiEntity> page = this.selectPage(
                new Query<FuzhuangkuanshiEntity>(params).getPage(),
                new EntityWrapper<FuzhuangkuanshiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<FuzhuangkuanshiEntity> wrapper) {
		  Page<FuzhuangkuanshiView> page =new Query<FuzhuangkuanshiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<FuzhuangkuanshiVO> selectListVO(Wrapper<FuzhuangkuanshiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public FuzhuangkuanshiVO selectVO(Wrapper<FuzhuangkuanshiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<FuzhuangkuanshiView> selectListView(Wrapper<FuzhuangkuanshiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public FuzhuangkuanshiView selectView(Wrapper<FuzhuangkuanshiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
