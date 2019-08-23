package com.controller;

import com.alibaba.fastjson.JSONObject;
import com.bean.PriorityConditionSet;
import com.mapper.PriorityConditionSetMapper;
import com.service.PriorityConditionSetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
public class PriorityConditionSetController {

    @Autowired
    PriorityConditionSetService priorityConditionSetService;
    @Autowired
    PriorityConditionSetMapper priorityConditionSetMapper;

    @RequestMapping("/selectPriorityConditionSet")
    @ResponseBody
    public JSONObject selectPriorityConditionSet(PriorityConditionSet priorityConditionSet) {
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("priorityConditionSetList",priorityConditionSetService.getPriorityConditionSet(priorityConditionSet));
        return jsonObject;
    }

    @RequestMapping("/insertPriorityConditionSet")
    @ResponseBody
    public JSONObject insertPriorityConditionSet(PriorityConditionSet priorityConditionSet) {
        JSONObject jsonObject = new JSONObject();
        Integer result = priorityConditionSetMapper.insert(priorityConditionSet);
        if (result > 0){
            jsonObject.put("info","插入成功!");
        }else{
            jsonObject.put("info","插入失败!");
        }
        return jsonObject;
    }

    @RequestMapping("/deletePriorityConditionSet")
    @ResponseBody
    public JSONObject deletePriorityConditionSet(PriorityConditionSet priorityConditionSet) {
        JSONObject jsonObject = new JSONObject();
        Integer result = priorityConditionSetMapper.delete(priorityConditionSet);
        if (result > 0){
            jsonObject.put("info","删除成功!");
        }else{
            jsonObject.put("info","删除失败!");
        }
        return jsonObject;
    }


    @RequestMapping("/updatePriorityConditionSet")
    @ResponseBody
    public JSONObject updatePriorityConditionSet(PriorityConditionSet priorityConditionSet) {
        JSONObject jsonObject = new JSONObject();
        Integer result = priorityConditionSetMapper.updateByPrimaryKeySelective(priorityConditionSet);
        if (result > 0){
            jsonObject.put("info","更新成功!");
        }else{
            jsonObject.put("info","更新失败!");
        }
        return jsonObject;
    }
}
