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


import com.dao.FuzhuangyuyueDao;
import com.entity.FuzhuangyuyueEntity;
import com.service.FuzhuangyuyueService;
import com.entity.vo.FuzhuangyuyueVO;
import com.entity.view.FuzhuangyuyueView;

@Service("fuzhuangyuyueService")
public class FuzhuangyuyueServiceImpl extends ServiceImpl<FuzhuangyuyueDao, FuzhuangyuyueEntity> implements FuzhuangyuyueService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<FuzhuangyuyueEntity> page = this.selectPage(
                new Query<FuzhuangyuyueEntity>(params).getPage(),
                new EntityWrapper<FuzhuangyuyueEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<FuzhuangyuyueEntity> wrapper) {
		  Page<FuzhuangyuyueView> page =new Query<FuzhuangyuyueView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<FuzhuangyuyueVO> selectListVO(Wrapper<FuzhuangyuyueEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public FuzhuangyuyueVO selectVO(Wrapper<FuzhuangyuyueEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<FuzhuangyuyueView> selectListView(Wrapper<FuzhuangyuyueEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public FuzhuangyuyueView selectView(Wrapper<FuzhuangyuyueEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
