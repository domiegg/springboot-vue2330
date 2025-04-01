package com.entity.view;

import com.entity.FuzhuangkuanshiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 服装款式
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2023-03-07 22:24:10
 */
@TableName("fuzhuangkuanshi")
public class FuzhuangkuanshiView  extends FuzhuangkuanshiEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public FuzhuangkuanshiView(){
	}
 
 	public FuzhuangkuanshiView(FuzhuangkuanshiEntity fuzhuangkuanshiEntity){
 	try {
			BeanUtils.copyProperties(this, fuzhuangkuanshiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
