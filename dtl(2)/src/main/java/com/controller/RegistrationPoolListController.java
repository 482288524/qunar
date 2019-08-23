package com.controller;

import com.alibaba.fastjson.JSONObject;
import com.bean.RegistrationPoolList;
import com.mapper.RegistrationPoolListMapper;
import com.service.RegistrationPoolListService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
public class RegistrationPoolListController {

    @Autowired
    RegistrationPoolListService registrationPoolListService;
    @Autowired
    RegistrationPoolListMapper registrationPoolListMapper;

    @RequestMapping("/selectRegistrationPoolList")
    @ResponseBody
    public JSONObject selectRegistrationPoolList(RegistrationPoolList registrationPoolList) {
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("registrationPoolList", registrationPoolListService.getRegistrationPoolList(registrationPoolList));
        return jsonObject;
    }

    @RequestMapping("/insertRegistrationPoolList")
    @ResponseBody
    public JSONObject insertRegistrationPoolList(RegistrationPoolList registrationPoolList) {
        JSONObject jsonObject = new JSONObject();
        Integer result = registrationPoolListMapper.insert(registrationPoolList);
        if (result > 0) {
            jsonObject.put("info", "插入成功!");
        } else {
            jsonObject.put("info", "插入失败!");
        }
        return jsonObject;
    }

    @RequestMapping("/updateRegistrationPoolList")
    @ResponseBody
    public JSONObject updateRegistrationPoolList(RegistrationPoolList registrationPoolList) {
        JSONObject jsonObject = new JSONObject();
        Integer result = registrationPoolListMapper.updateByPrimaryKeySelective(registrationPoolList);
        if (result > 0) {
            jsonObject.put("info", "更新成功!");
        } else {
            jsonObject.put("info", "更新失败!");
        }
        return jsonObject;
    }

}
