package com.entity.view;

import com.entity.MianliaoleibieEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 面料类别
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2023-03-07 22:24:10
 */
@TableName("mianliaoleibie")
public class MianliaoleibieView  extends MianliaoleibieEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public MianliaoleibieView(){
	}
 
 	public MianliaoleibieView(MianliaoleibieEntity mianliaoleibieEntity){
 	try {
			BeanUtils.copyProperties(this, mianliaoleibieEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
