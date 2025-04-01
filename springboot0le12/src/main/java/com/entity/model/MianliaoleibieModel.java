package com.entity.model;

import com.entity.MianliaoleibieEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * 面料类别
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2023-03-07 22:24:10
 */
public class MianliaoleibieModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 面料价格
	 */
	
	private Float mianliaojiage;
				
	
	/**
	 * 设置：面料价格
	 */
	 
	public void setMianliaojiage(Float mianliaojiage) {
		this.mianliaojiage = mianliaojiage;
	}
	
	/**
	 * 获取：面料价格
	 */
	public Float getMianliaojiage() {
		return mianliaojiage;
	}
			
}
