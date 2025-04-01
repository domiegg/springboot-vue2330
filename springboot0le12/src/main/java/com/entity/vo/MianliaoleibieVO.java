package com.entity.vo;

import com.entity.MianliaoleibieEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * 面料类别
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2023-03-07 22:24:10
 */
public class MianliaoleibieVO  implements Serializable {
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
