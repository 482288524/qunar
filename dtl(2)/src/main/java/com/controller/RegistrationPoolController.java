package com.controller;

import com.alibaba.fastjson.JSONObject;
import com.bean.RegistrationPool;
import com.mapper.RegistrationPoolMapper;
import com.service.RegistrationPoolService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
public class RegistrationPoolController {

    @Autowired
    RegistrationPoolService registrationPoolService;
    @Autowired
    RegistrationPoolMapper registrationPoolMapper;

    @RequestMapping("/selectRegistrationPool")
    @ResponseBody
    public JSONObject selectRegistrationPool(RegistrationPool registrationPool) {
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("registrationPoolList",registrationPoolService.getRegistrationPool(registrationPool));
        return jsonObject;
    }

    @RequestMapping("/insertRegistrationPool")
    @ResponseBody
    public JSONObject insertRegistrationPool(RegistrationPool registrationPool) {
        JSONObject jsonObject = new JSONObject();
        Integer result = registrationPoolMapper.insert(registrationPool);
        if(result > 0){
            jsonObject.put("info","插入成功!");
        }else {
            jsonObject.put("info","插入失败!");
        }
        return jsonObject;
    }

    @RequestMapping("/deleteRegistrationPool")
    @ResponseBody
    public JSONObject deleteRegistrationPool(RegistrationPool registrationPool) {
        JSONObject jsonObject = new JSONObject();
        Integer result = registrationPoolMapper.delete(registrationPool);
        if(result > 0){
            jsonObject.put("info","删除成功!");
        }else {
            jsonObject.put("info","删除失败!");
        }
        return jsonObject;
    }

    @RequestMapping("/updateRegistrationPool")
    @ResponseBody
    public JSONObject updateRegistrationPool(RegistrationPool registrationPool) {
        JSONObject jsonObject = new JSONObject();
        Integer result = registrationPoolMapper.updateByPrimaryKeySelective(registrationPool);
        if(result > 0){
            jsonObject.put("info","更新成功!");
        }else {
            jsonObject.put("info","更新失败!");
        }
        return jsonObject;
    }
}
