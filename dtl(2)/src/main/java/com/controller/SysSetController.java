package com.controller;

import com.alibaba.fastjson.JSONObject;
import com.bean.SysSet;
import com.mapper.SysSetMapper;
import com.service.SysSetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
public class SysSetController {

    @Autowired
    SysSetService sysSetService;
    @Autowired
    SysSetMapper sysSetMapper;

    @RequestMapping("/selectSysSet")
    @ResponseBody
    public JSONObject selectSysSet(SysSet sysSet) {
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("sysSetList",sysSetService.getSysSet(sysSet));
        return jsonObject;
    }

    @RequestMapping("/insertSysSet")
    @ResponseBody
    public JSONObject insertSysSet(SysSet sysSet) {
        JSONObject jsonObject = new JSONObject();
        Integer result = sysSetMapper.insert(sysSet);
        if (result > 0 ){
            jsonObject.put("info","插入成功!");
        }else{
            jsonObject.put("info","插入失败!");
        }
        return jsonObject;
    }

    @RequestMapping("/deleteSysSet")
    @ResponseBody
    public JSONObject deleteSysSet(SysSet sysSet) {
        JSONObject jsonObject = new JSONObject();
        Integer result = sysSetMapper.delete(sysSet);
        if (result > 0 ){
            jsonObject.put("info","删除成功!");
        }else{
            jsonObject.put("info","删除失败!");
        }
        return jsonObject;
    }

    @RequestMapping("/updateSysSet")
    @ResponseBody
    public JSONObject updateSysSet(SysSet sysSet) {
        JSONObject jsonObject = new JSONObject();
        Integer result = sysSetMapper.updateByPrimaryKeySelective(sysSet);
        if (result > 0 ){
            jsonObject.put("info","更新成功!");
        }else{
            jsonObject.put("info","更新失败!");
        }
        return jsonObject;
    }

}
