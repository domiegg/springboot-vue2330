package com.entity.view;

import com.entity.DiscussremaixifuEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 热卖西服评论表
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2023-03-07 22:24:10
 */
@TableName("discussremaixifu")
public class DiscussremaixifuView  extends DiscussremaixifuEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public DiscussremaixifuView(){
	}
 
 	public DiscussremaixifuView(DiscussremaixifuEntity discussremaixifuEntity){
 	try {
			BeanUtils.copyProperties(this, discussremaixifuEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
