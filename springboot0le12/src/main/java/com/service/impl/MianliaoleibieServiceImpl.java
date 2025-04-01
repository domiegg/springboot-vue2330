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


import com.dao.MianliaoleibieDao;
import com.entity.MianliaoleibieEntity;
import com.service.MianliaoleibieService;
import com.entity.vo.MianliaoleibieVO;
import com.entity.view.MianliaoleibieView;

@Service("mianliaoleibieService")
public class MianliaoleibieServiceImpl extends ServiceImpl<MianliaoleibieDao, MianliaoleibieEntity> implements MianliaoleibieService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<MianliaoleibieEntity> page = this.selectPage(
                new Query<MianliaoleibieEntity>(params).getPage(),
                new EntityWrapper<MianliaoleibieEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<MianliaoleibieEntity> wrapper) {
		  Page<MianliaoleibieView> page =new Query<MianliaoleibieView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<MianliaoleibieVO> selectListVO(Wrapper<MianliaoleibieEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public MianliaoleibieVO selectVO(Wrapper<MianliaoleibieEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<MianliaoleibieView> selectListView(Wrapper<MianliaoleibieEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public MianliaoleibieView selectView(Wrapper<MianliaoleibieEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
