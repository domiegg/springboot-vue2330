package com.entity.view;

import com.entity.RemaixifuEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 热卖西服
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2023-03-07 22:24:10
 */
@TableName("remaixifu")
public class RemaixifuView  extends RemaixifuEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public RemaixifuView(){
	}
 
 	public RemaixifuView(RemaixifuEntity remaixifuEntity){
 	try {
			BeanUtils.copyProperties(this, remaixifuEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
