package com.controller;

import com.alibaba.fastjson.JSONObject;
import com.bean.Hospital;
import com.mapper.HospitalMapper;
import com.service.HospitalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
public class HospitalController {

    @Autowired
    HospitalService hospitalService;
    @Autowired
    HospitalMapper hospitalMapper;

    @RequestMapping("/selectHospital")
    @ResponseBody
    public JSONObject selectHospital(Hospital hospital) {
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("hospitalList", hospitalService.getHospital(hospital));
        return jsonObject;
    }

    @RequestMapping("/insertHospital")
    @ResponseBody
    public JSONObject insertHospital(Hospital hospital) {
        JSONObject jsonObject = new JSONObject();
        Integer result = hospitalMapper.insert(hospital);
        if (result > 0 ) {
            jsonObject.put("info", "插入成功");
        } else {
            jsonObject.put("info", "插入失败");
        }
        return jsonObject;
    }

    @RequestMapping("/deleteHospital")
    @ResponseBody
    public JSONObject deleteHospital(Hospital hospital) {
        JSONObject jsonObject = new JSONObject();
        Integer result = hospitalMapper.delete(hospital);
        if (result > 0 ) {
            jsonObject.put("info", "删除成功");
        } else {
            jsonObject.put("info", "删除失败");
        }
        return jsonObject;
    }

    @RequestMapping("/updateHospital")
    @ResponseBody
    public JSONObject updateHospital(Hospital hospital) {
        JSONObject jsonObject = new JSONObject();
        Integer result = hospitalMapper.updateByPrimaryKeySelective(hospital);
        if (result > 0 ) {
            jsonObject.put("info", "更新成功");
        } else {
            jsonObject.put("info", "更新失败");
        }
        return jsonObject;
    }

}
