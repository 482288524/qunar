package com.controller;

import com.alibaba.fastjson.JSONObject;
import com.bean.AppointmentInfo;
import com.mapper.AppointmentInfoMapper;
import com.service.AppointmentInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
public class AppointmentInfoController {

    @Autowired
    AppointmentInfoService appointmentInfoService;
    @Autowired
    AppointmentInfoMapper appointmentInfoMapper;

    @RequestMapping("/selectAppointmentInfo")
    @ResponseBody
    public JSONObject selectAppointmentInfo(AppointmentInfo appointmentInfo) {
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("appointmentInfoList", appointmentInfoService.getAppointmentInfo(appointmentInfo));
        return jsonObject;
    }

    @RequestMapping("/insertAppointmentInfo")
    @ResponseBody
    public JSONObject insertAppointmentInfo(AppointmentInfo appointmentInfo) {
        JSONObject jsonObject = new JSONObject();
        Integer result = appointmentInfoMapper.insert(appointmentInfo);
        if (result > 0 ) {
            jsonObject.put("info", "插入成功");
        } else {
            jsonObject.put("info", "插入失败");
        }
        return jsonObject;
    }

    @RequestMapping("/deleteAppointmentInfo")
    @ResponseBody
    public JSONObject deleteAppointmentInfo(AppointmentInfo appointmentInfo) {
        JSONObject jsonObject = new JSONObject();
        Integer result = appointmentInfoMapper.delete(appointmentInfo);
        if (result > 0 ) {
            jsonObject.put("info", "删除成功");
        } else {
            jsonObject.put("info", "删除失败");
        }
        return jsonObject;
    }

    @RequestMapping("/updateAppointmentInfo")
    @ResponseBody
    public JSONObject updateAppointmentInfo(AppointmentInfo appointmentInfo) {
        JSONObject jsonObject = new JSONObject();
        Integer result = appointmentInfoMapper.updateByPrimaryKeySelective(appointmentInfo);
        if (result > 0 ) {
            jsonObject.put("info", "更新成功");
        } else {
            jsonObject.put("info", "更新失败");
        }
        return jsonObject;
    }

}
