package com.controller;

import com.alibaba.fastjson.JSONObject;
import com.bean.AdminInfo;
import com.mapper.AdminInfoMapper;
import com.service.AdminInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
public class AdminInfoController {

    @Autowired
    AdminInfoService adminInfoService;
    @Autowired
    AdminInfoMapper adminInfoMapper;

    @RequestMapping("/selectAdminInfo")
    @ResponseBody
    public JSONObject selectAdminInfo(AdminInfo adminInfo) {
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("adminInfoList", adminInfoService.getAdminInfo(adminInfo));
        return jsonObject;
    }

    @RequestMapping("/insertAdminInfo")
    @ResponseBody
    public JSONObject insertAdminInfo(AdminInfo adminInfo) {
        JSONObject jsonObject = new JSONObject();
        Integer result = adminInfoMapper.insert(adminInfo);
        if (result > 0 ) {
            jsonObject.put("info", "插入成功");
        } else {
            jsonObject.put("info", "插入失败");
        }
        return jsonObject;
    }

    @RequestMapping("/deleteAdminInfo")
    @ResponseBody
    public JSONObject deleteAdminInfo(AdminInfo adminInfo) {
        JSONObject jsonObject = new JSONObject();
        Integer result = adminInfoMapper.delete(adminInfo);
        if (result > 0 ) {
            jsonObject.put("info", "删除成功");
        } else {
            jsonObject.put("info", "删除失败");
        }
        return jsonObject;
    }

    @RequestMapping("/updateAdminInfo")
    @ResponseBody
    public JSONObject updateAdminInfo(AdminInfo adminInfo) {
        JSONObject jsonObject = new JSONObject();
        Integer result = adminInfoMapper.updateByPrimaryKeySelective(adminInfo);
        if (result > 0 ) {
            jsonObject.put("info", "更新成功");
        } else {
            jsonObject.put("info", "更新失败");
        }
        return jsonObject;
    }

}
