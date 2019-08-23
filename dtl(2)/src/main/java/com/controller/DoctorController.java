package com.controller;

import com.alibaba.fastjson.JSONObject;
import com.bean.Doctor;
import com.mapper.DoctorMapper;
import com.service.DoctorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
public class DoctorController {

    @Autowired
    DoctorService doctorService;
    @Autowired
    DoctorMapper doctorMapper;

    @RequestMapping("/selectDoctor")
    @ResponseBody
    public JSONObject selectDoctor(Doctor doctor) {
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("doctorList", doctorService.getDoctor(doctor));
        return jsonObject;
    }

    @RequestMapping("/insertDoctor")
    @ResponseBody
    public JSONObject insertDoctor(Doctor doctor) {
        JSONObject jsonObject = new JSONObject();
        Integer result = doctorMapper.insert(doctor);
        if (result > 0 ) {
            jsonObject.put("info", "插入成功");
        } else {
            jsonObject.put("info", "插入失败");
        }
        return jsonObject;
    }

    @RequestMapping("/deleteDoctor")
    @ResponseBody
    public JSONObject deleteDoctor(Doctor doctor) {
        JSONObject jsonObject = new JSONObject();
        Integer result = doctorMapper.delete(doctor);
        if (result > 0 ) {
            jsonObject.put("info", "删除成功");
        } else {
            jsonObject.put("info", "删除失败");
        }
        return jsonObject;
    }

    @RequestMapping("/updateDoctor")
    @ResponseBody
    public JSONObject updateDoctor(Doctor doctor) {
        JSONObject jsonObject = new JSONObject();
        Integer result = doctorMapper.updateByPrimaryKeySelective(doctor);
        if (result > 0 ) {
            jsonObject.put("info", "更新成功");
        } else {
            jsonObject.put("info", "更新失败");
        }
        return jsonObject;
    }

}
