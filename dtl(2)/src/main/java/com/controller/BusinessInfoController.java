package com.controller;

import com.alibaba.fastjson.JSONObject;
import com.bean.BusinessInfo;
import com.mapper.BusinessInfoMapper;
import com.service.BusinessInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
public class BusinessInfoController {

    @Autowired
    BusinessInfoService businessInfoService;
    @Autowired
    BusinessInfoMapper businessInfoMapper;

    @RequestMapping("/selectBusinessInfo")
    @ResponseBody
    public JSONObject selectBusinessInfo(BusinessInfo businessInfo) {
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("businessInfoList", businessInfoService.getBusinessInfo(businessInfo));
        return jsonObject;
    }

    @RequestMapping("/insertBusinessInfo")
    @ResponseBody
    public JSONObject insertBusinessInfo(BusinessInfo businessInfo) {
        JSONObject jsonObject = new JSONObject();
        Integer result = businessInfoMapper.insert(businessInfo);
        if (result > 0 ) {
            jsonObject.put("info", "插入成功");
        } else {
            jsonObject.put("info", "插入失败");
        }
        return jsonObject;
    }

    @RequestMapping("/deleteBusinessInfo")
    @ResponseBody
    public JSONObject deleteBusinessInfo(BusinessInfo businessInfo) {
        JSONObject jsonObject = new JSONObject();
        Integer result = businessInfoMapper.delete(businessInfo);
        businessInfoMapper.delInterPlanLstById(businessInfo.getIntervalPlanId());
        if (result > 0 ) {
            jsonObject.put("info", "删除成功");
        } else {
            jsonObject.put("info", "删除失败");
        }
        return jsonObject;
    }

    @RequestMapping("/updateBusinessInfo")
    @ResponseBody
    public JSONObject updateBusinessInfo(BusinessInfo businessInfo) {
        JSONObject jsonObject = new JSONObject();
        Integer result = businessInfoMapper.updateByPrimaryKeySelective(businessInfo);
        if (result > 0 ) {
            jsonObject.put("info", "更新成功");
        } else {
            jsonObject.put("info", "更新失败");
        }
        return jsonObject;
    }

}
