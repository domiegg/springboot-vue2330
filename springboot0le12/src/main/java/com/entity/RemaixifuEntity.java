package com.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.beanutils.BeanUtils;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.enums.FieldFill;
import com.baomidou.mybatisplus.enums.IdType;


/**
 * 热卖西服
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2023-03-07 22:24:10
 */
@TableName("remaixifu")
public class RemaixifuEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public RemaixifuEntity() {
		
	}
	
	public RemaixifuEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	/**
	 * 主键id
	 */
	@TableId
	private Long id;
	/**
	 * 服装编号
	 */
					
	private String fuzhuangbianhao;
	
	/**
	 * 服装名称
	 */
					
	private String fuzhuangmingcheng;
	
	/**
	 * 花纹图案
	 */
					
	private String huawentuan;
	
	/**
	 * 服装款式
	 */
					
	private String fuzhuangkuanshi;
	
	/**
	 * 面料类别
	 */
					
	private String mianliaoleibie;
	
	/**
	 * 衣门襟
	 */
					
	private String yimenjin;
	
	/**
	 * 尺码
	 */
					
	private String chima;
	
	/**
	 * 服装价格
	 */
					
	private Integer fuzhuangjiage;
	
	/**
	 * 服装详情
	 */
					
	private String fuzhuangxiangqing;
	
	/**
	 * 赞
	 */
					
	private Integer thumbsupnum;
	
	/**
	 * 踩
	 */
					
	private Integer crazilynum;
	
	/**
	 * 最近点击时间
	 */
				
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 		
	private Date clicktime;
	
	/**
	 * 点击次数
	 */
					
	private Integer clicknum;
	
	
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
	private Date addtime;

	public Date getAddtime() {
		return addtime;
	}
	public void setAddtime(Date addtime) {
		this.addtime = addtime;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	/**
	 * 设置：服装编号
	 */
	public void setFuzhuangbianhao(String fuzhuangbianhao) {
		this.fuzhuangbianhao = fuzhuangbianhao;
	}
	/**
	 * 获取：服装编号
	 */
	public String getFuzhuangbianhao() {
		return fuzhuangbianhao;
	}
	/**
	 * 设置：服装名称
	 */
	public void setFuzhuangmingcheng(String fuzhuangmingcheng) {
		this.fuzhuangmingcheng = fuzhuangmingcheng;
	}
	/**
	 * 获取：服装名称
	 */
	public String getFuzhuangmingcheng() {
		return fuzhuangmingcheng;
	}
	/**
	 * 设置：花纹图案
	 */
	public void setHuawentuan(String huawentuan) {
		this.huawentuan = huawentuan;
	}
	/**
	 * 获取：花纹图案
	 */
	public String getHuawentuan() {
		return huawentuan;
	}
	/**
	 * 设置：服装款式
	 */
	public void setFuzhuangkuanshi(String fuzhuangkuanshi) {
		this.fuzhuangkuanshi = fuzhuangkuanshi;
	}
	/**
	 * 获取：服装款式
	 */
	public String getFuzhuangkuanshi() {
		return fuzhuangkuanshi;
	}
	/**
	 * 设置：面料类别
	 */
	public void setMianliaoleibie(String mianliaoleibie) {
		this.mianliaoleibie = mianliaoleibie;
	}
	/**
	 * 获取：面料类别
	 */
	public String getMianliaoleibie() {
		return mianliaoleibie;
	}
	/**
	 * 设置：衣门襟
	 */
	public void setYimenjin(String yimenjin) {
		this.yimenjin = yimenjin;
	}
	/**
	 * 获取：衣门襟
	 */
	public String getYimenjin() {
		return yimenjin;
	}
	/**
	 * 设置：尺码
	 */
	public void setChima(String chima) {
		this.chima = chima;
	}
	/**
	 * 获取：尺码
	 */
	public String getChima() {
		return chima;
	}
	/**
	 * 设置：服装价格
	 */
	public void setFuzhuangjiage(Integer fuzhuangjiage) {
		this.fuzhuangjiage = fuzhuangjiage;
	}
	/**
	 * 获取：服装价格
	 */
	public Integer getFuzhuangjiage() {
		return fuzhuangjiage;
	}
	/**
	 * 设置：服装详情
	 */
	public void setFuzhuangxiangqing(String fuzhuangxiangqing) {
		this.fuzhuangxiangqing = fuzhuangxiangqing;
	}
	/**
	 * 获取：服装详情
	 */
	public String getFuzhuangxiangqing() {
		return fuzhuangxiangqing;
	}
	/**
	 * 设置：赞
	 */
	public void setThumbsupnum(Integer thumbsupnum) {
		this.thumbsupnum = thumbsupnum;
	}
	/**
	 * 获取：赞
	 */
	public Integer getThumbsupnum() {
		return thumbsupnum;
	}
	/**
	 * 设置：踩
	 */
	public void setCrazilynum(Integer crazilynum) {
		this.crazilynum = crazilynum;
	}
	/**
	 * 获取：踩
	 */
	public Integer getCrazilynum() {
		return crazilynum;
	}
	/**
	 * 设置：最近点击时间
	 */
	public void setClicktime(Date clicktime) {
		this.clicktime = clicktime;
	}
	/**
	 * 获取：最近点击时间
	 */
	public Date getClicktime() {
		return clicktime;
	}
	/**
	 * 设置：点击次数
	 */
	public void setClicknum(Integer clicknum) {
		this.clicknum = clicknum;
	}
	/**
	 * 获取：点击次数
	 */
	public Integer getClicknum() {
		return clicknum;
	}

}
