package com.controller;

import com.alibaba.fastjson.JSONObject;
import com.bean.AppointmentPool;
import com.mapper.AppointmentPoolMapper;
import com.service.AppointmentPoolService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
public class AppointmentPoolController {

    @Autowired
    AppointmentPoolService appointmentPoolService;
    @Autowired
    AppointmentPoolMapper appointmentPoolMapper;

    @RequestMapping("/selectAppointmentPool")
    @ResponseBody
    public JSONObject selectAppointmentPool(AppointmentPool appointmentPool) {
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("appointmentPoolList", appointmentPoolService.getAppointmentPool(appointmentPool));
        return jsonObject;
    }

    @RequestMapping("/insertAppointmentPool")
    @ResponseBody
    public JSONObject insertAppointmentPool(AppointmentPool appointmentPool) {
        JSONObject jsonObject = new JSONObject();
        Integer result = appointmentPoolMapper.insert(appointmentPool);
        if (result > 0 ) {
            jsonObject.put("info", "插入成功");
        } else {
            jsonObject.put("info", "插入失败");
        }
        return jsonObject;
    }

    @RequestMapping("/deleteAppointmentPool")
    @ResponseBody
    public JSONObject deleteAppointmentPool(AppointmentPool appointmentPool) {
        JSONObject jsonObject = new JSONObject();
        Integer result = appointmentPoolMapper.delete(appointmentPool);
        if (result > 0 ) {
            jsonObject.put("info", "删除成功");
        } else {
            jsonObject.put("info", "删除失败");
        }
        return jsonObject;
    }

    @RequestMapping("/updateAppointmentPool")
    @ResponseBody
    public JSONObject updateAppointmentPool(AppointmentPool appointmentPool) {
        JSONObject jsonObject = new JSONObject();
        Integer result = appointmentPoolMapper.updateByPrimaryKeySelective(appointmentPool);
        if (result > 0 ) {
            jsonObject.put("info", "更新成功");
        } else {
            jsonObject.put("info", "更新失败");
        }
        return jsonObject;
    }

}
