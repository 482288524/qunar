package com.controller;

import com.alibaba.fastjson.JSONObject;
import com.bean.IntervalPlan;
import com.mapper.IntervalPlanMapper;
import com.service.IntervalPlanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
public class IntervalPlanController {

    @Autowired
    IntervalPlanService intervalPlanService;
    @Autowired
    IntervalPlanMapper intervalPlanMapper;

    @RequestMapping("/selectIntervalPlan")
    @ResponseBody
    public JSONObject selectIntervalPlan(IntervalPlan intervalPlan) {
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("intervalPlanList",intervalPlanService.getIntervalPlan(intervalPlan));
        return jsonObject;
    }

    @RequestMapping("/insertIntervalPlan")
    @ResponseBody
    public JSONObject insertIntervalPlan(IntervalPlan intervalPlan) {
        JSONObject jsonObject = new JSONObject();
        Integer result = intervalPlanMapper.insert(intervalPlan);
        if(result > 0 ){
            jsonObject.put("info","插入成功!");
        }else{
            jsonObject.put("info","插入失败!");
        }
        return jsonObject;
    }

    @RequestMapping("/deleteIntervalPlan")
    @ResponseBody
    public JSONObject deleteIntervalPlan(IntervalPlan intervalPlan) {
        JSONObject jsonObject = new JSONObject();
        Integer result = intervalPlanMapper.delete(intervalPlan);
        if(result > 0 ){
            jsonObject.put("info","删除成功!");
        }else{
            jsonObject.put("info","删除失败!");
        }
        return jsonObject;
    }

    @RequestMapping("/updateIntervalPlan")
    @ResponseBody
    public JSONObject updateIntervalPlan(IntervalPlan intervalPlan) {
        JSONObject jsonObject = new JSONObject();
        Integer result = intervalPlanMapper.updateByPrimaryKeySelective(intervalPlan);
        if(result > 0 ){
            jsonObject.put("info","更新成功!");
        }else{
            jsonObject.put("info","更新失败!");
        }
        return jsonObject;
    }
}
