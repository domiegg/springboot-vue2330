package com.controller;

import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Map;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Date;
import java.util.List;
import javax.servlet.http.HttpServletRequest;

import com.utils.ValidatorUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.annotation.IgnoreAuth;

import com.entity.RemaixifuEntity;
import com.entity.view.RemaixifuView;

import com.service.RemaixifuService;
import com.service.TokenService;
import com.utils.PageUtils;
import com.utils.R;
import com.utils.MD5Util;
import com.utils.MPUtil;
import com.utils.CommonUtil;
import java.io.IOException;
import com.service.StoreupService;
import com.entity.StoreupEntity;

/**
 * 热卖西服
 * 后端接口
 * @author 
 * @email 
 * @date 2023-03-07 22:24:10
 */
@RestController
@RequestMapping("/remaixifu")
public class RemaixifuController {
    @Autowired
    private RemaixifuService remaixifuService;

    @Autowired
    private StoreupService storeupService;

    


    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,RemaixifuEntity remaixifu,
                @RequestParam(required = false) Double fuzhuangjiagestart,
                @RequestParam(required = false) Double fuzhuangjiageend,
		HttpServletRequest request){
        EntityWrapper<RemaixifuEntity> ew = new EntityWrapper<RemaixifuEntity>();
                if(fuzhuangjiagestart!=null) ew.ge("fuzhuangjiage", fuzhuangjiagestart);
                if(fuzhuangjiageend!=null) ew.le("fuzhuangjiage", fuzhuangjiageend);

		PageUtils page = remaixifuService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, remaixifu), params), params));

        return R.ok().put("data", page);
    }
    
    /**
     * 前端列表
     */
	@IgnoreAuth
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,RemaixifuEntity remaixifu, 
                @RequestParam(required = false) Double fuzhuangjiagestart,
                @RequestParam(required = false) Double fuzhuangjiageend,
		HttpServletRequest request){
        EntityWrapper<RemaixifuEntity> ew = new EntityWrapper<RemaixifuEntity>();
                if(fuzhuangjiagestart!=null) ew.ge("fuzhuangjiage", fuzhuangjiagestart);
                if(fuzhuangjiageend!=null) ew.le("fuzhuangjiage", fuzhuangjiageend);

		PageUtils page = remaixifuService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, remaixifu), params), params));
        return R.ok().put("data", page);
    }

	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( RemaixifuEntity remaixifu){
       	EntityWrapper<RemaixifuEntity> ew = new EntityWrapper<RemaixifuEntity>();
      	ew.allEq(MPUtil.allEQMapPre( remaixifu, "remaixifu")); 
        return R.ok().put("data", remaixifuService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(RemaixifuEntity remaixifu){
        EntityWrapper< RemaixifuEntity> ew = new EntityWrapper< RemaixifuEntity>();
 		ew.allEq(MPUtil.allEQMapPre( remaixifu, "remaixifu")); 
		RemaixifuView remaixifuView =  remaixifuService.selectView(ew);
		return R.ok("查询热卖西服成功").put("data", remaixifuView);
    }
	
    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        RemaixifuEntity remaixifu = remaixifuService.selectById(id);
		remaixifu.setClicknum(remaixifu.getClicknum()+1);
		remaixifu.setClicktime(new Date());
		remaixifuService.updateById(remaixifu);
        return R.ok().put("data", remaixifu);
    }

    /**
     * 前端详情
     */
	@IgnoreAuth
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        RemaixifuEntity remaixifu = remaixifuService.selectById(id);
		remaixifu.setClicknum(remaixifu.getClicknum()+1);
		remaixifu.setClicktime(new Date());
		remaixifuService.updateById(remaixifu);
        return R.ok().put("data", remaixifu);
    }
    


    /**
     * 赞或踩
     */
    @RequestMapping("/thumbsup/{id}")
    public R vote(@PathVariable("id") String id,String type){
        RemaixifuEntity remaixifu = remaixifuService.selectById(id);
        if(type.equals("1")) {
        	remaixifu.setThumbsupnum(remaixifu.getThumbsupnum()+1);
        } else {
        	remaixifu.setCrazilynum(remaixifu.getCrazilynum()+1);
        }
        remaixifuService.updateById(remaixifu);
        return R.ok("投票成功");
    }

    /**
     * 后端保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody RemaixifuEntity remaixifu, HttpServletRequest request){
    	remaixifu.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(remaixifu);
        remaixifuService.insert(remaixifu);
        return R.ok();
    }
    
    /**
     * 前端保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody RemaixifuEntity remaixifu, HttpServletRequest request){
    	remaixifu.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(remaixifu);
        remaixifuService.insert(remaixifu);
        return R.ok();
    }



    /**
     * 修改
     */
    @RequestMapping("/update")
    @Transactional
    public R update(@RequestBody RemaixifuEntity remaixifu, HttpServletRequest request){
        //ValidatorUtils.validateEntity(remaixifu);
        remaixifuService.updateById(remaixifu);//全部更新
        return R.ok();
    }


    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        remaixifuService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }
    
    /**
     * 提醒接口
     */
	@RequestMapping("/remind/{columnName}/{type}")
	public R remindCount(@PathVariable("columnName") String columnName, HttpServletRequest request, 
						 @PathVariable("type") String type,@RequestParam Map<String, Object> map) {
		map.put("column", columnName);
		map.put("type", type);
		
		if(type.equals("2")) {
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
			Calendar c = Calendar.getInstance();
			Date remindStartDate = null;
			Date remindEndDate = null;
			if(map.get("remindstart")!=null) {
				Integer remindStart = Integer.parseInt(map.get("remindstart").toString());
				c.setTime(new Date()); 
				c.add(Calendar.DAY_OF_MONTH,remindStart);
				remindStartDate = c.getTime();
				map.put("remindstart", sdf.format(remindStartDate));
			}
			if(map.get("remindend")!=null) {
				Integer remindEnd = Integer.parseInt(map.get("remindend").toString());
				c.setTime(new Date());
				c.add(Calendar.DAY_OF_MONTH,remindEnd);
				remindEndDate = c.getTime();
				map.put("remindend", sdf.format(remindEndDate));
			}
		}
		
		Wrapper<RemaixifuEntity> wrapper = new EntityWrapper<RemaixifuEntity>();
		if(map.get("remindstart")!=null) {
			wrapper.ge(columnName, map.get("remindstart"));
		}
		if(map.get("remindend")!=null) {
			wrapper.le(columnName, map.get("remindend"));
		}


		int count = remaixifuService.selectCount(wrapper);
		return R.ok().put("count", count);
	}
	
	/**
     * 前端智能排序
     */
	@IgnoreAuth
    @RequestMapping("/autoSort")
    public R autoSort(@RequestParam Map<String, Object> params,RemaixifuEntity remaixifu, HttpServletRequest request,String pre){
        EntityWrapper<RemaixifuEntity> ew = new EntityWrapper<RemaixifuEntity>();
        Map<String, Object> newMap = new HashMap<String, Object>();
        Map<String, Object> param = new HashMap<String, Object>();
		Iterator<Map.Entry<String, Object>> it = param.entrySet().iterator();
		while (it.hasNext()) {
			Map.Entry<String, Object> entry = it.next();
			String key = entry.getKey();
			String newKey = entry.getKey();
			if (pre.endsWith(".")) {
				newMap.put(pre + newKey, entry.getValue());
			} else if (StringUtils.isEmpty(pre)) {
				newMap.put(newKey, entry.getValue());
			} else {
				newMap.put(pre + "." + newKey, entry.getValue());
			}
		}
		params.put("sort", "clicknum");
        params.put("order", "desc");
		PageUtils page = remaixifuService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, remaixifu), params), params));
        return R.ok().put("data", page);
    }


    /**
     * 协同算法（按收藏推荐）
     */
    @RequestMapping("/autoSort2")
    public R autoSort2(@RequestParam Map<String, Object> params,RemaixifuEntity remaixifu, HttpServletRequest request){
        String userId = request.getSession().getAttribute("userId").toString();
        String inteltypeColumn = "fuzhuangkuanshi";
        List<StoreupEntity> storeups = storeupService.selectList(new EntityWrapper<StoreupEntity>().eq("type", 1).eq("userid", userId).eq("tablename", "remaixifu").orderBy("addtime", false));
        List<String> inteltypes = new ArrayList<String>();
        Integer limit = params.get("limit")==null?10:Integer.parseInt(params.get("limit").toString());
        List<RemaixifuEntity> remaixifuList = new ArrayList<RemaixifuEntity>();
        //去重
        if(storeups!=null && storeups.size()>0) {
            for(StoreupEntity s : storeups) {
                remaixifuList.addAll(remaixifuService.selectList(new EntityWrapper<RemaixifuEntity>().eq(inteltypeColumn, s.getInteltype())));
            }
        }
        EntityWrapper<RemaixifuEntity> ew = new EntityWrapper<RemaixifuEntity>();
        params.put("sort", "id");
        params.put("order", "desc");
        PageUtils page = remaixifuService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, remaixifu), params), params));
        List<RemaixifuEntity> pageList = (List<RemaixifuEntity>)page.getList();
        if(remaixifuList.size()<limit) {
            int toAddNum = (limit-remaixifuList.size())<=pageList.size()?(limit-remaixifuList.size()):pageList.size();
            for(RemaixifuEntity o1 : pageList) {
                boolean addFlag = true;
                for(RemaixifuEntity o2 : remaixifuList) {
                    if(o1.getId().intValue()==o2.getId().intValue()) {
                        addFlag = false;
                        break;
                    }
                }
                if(addFlag) {
                    remaixifuList.add(o1);
                    if(--toAddNum==0) break;
                }
            }
        } else if(remaixifuList.size()>limit) {
            remaixifuList = remaixifuList.subList(0, limit);
        }
        page.setList(remaixifuList);
        return R.ok().put("data", page);
    }







}
