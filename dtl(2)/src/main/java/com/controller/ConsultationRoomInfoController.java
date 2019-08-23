package com.controller;

import com.alibaba.fastjson.JSONObject;
import com.bean.ConsultationRoomInfo;
import com.mapper.ConsultationRoomInfoMapper;
import com.service.ConsultationRoomInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
public class ConsultationRoomInfoController {

    @Autowired
    ConsultationRoomInfoService consultationRoomInfoService;
    @Autowired
    ConsultationRoomInfoMapper consultationRoomInfoMapper;

    @RequestMapping("/selectConsultationRoomInfo")
    @ResponseBody
    public JSONObject selectConsultationRoomInfo(ConsultationRoomInfo consultationRoomInfo) {
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("consultationRoomInfoList", consultationRoomInfoService.getConsultationRoomInfo(consultationRoomInfo));
        return jsonObject;
    }

    @RequestMapping("/insertConsultationRoomInfo")
    @ResponseBody
    public JSONObject insertConsultationRoomInfo(ConsultationRoomInfo consultationRoomInfo) {
        JSONObject jsonObject = new JSONObject();
        Integer result = consultationRoomInfoMapper.insert(consultationRoomInfo);
        if (result > 0 ) {
            jsonObject.put("info", "插入成功");
        } else {
            jsonObject.put("info", "插入失败");
        }
        return jsonObject;
    }

    @RequestMapping("/deleteConsultationRoomInfo")
    @ResponseBody
    public JSONObject deleteConsultationRoomInfo(ConsultationRoomInfo consultationRoomInfo) {
        JSONObject jsonObject = new JSONObject();
        Integer result = consultationRoomInfoMapper.delete(consultationRoomInfo);
        if (result > 0 ) {
            jsonObject.put("info", "删除成功");
        } else {
            jsonObject.put("info", "删除失败");
        }
        return jsonObject;
    }

    @RequestMapping("/updateConsultationRoomInfo")
    @ResponseBody
    public JSONObject updateConsultationRoomInfo(ConsultationRoomInfo consultationRoomInfo) {
        JSONObject jsonObject = new JSONObject();
        Integer result = consultationRoomInfoMapper.updateByPrimaryKeySelective(consultationRoomInfo);
        if (result > 0 ) {
            jsonObject.put("info", "更新成功");
        } else {
            jsonObject.put("info", "更新失败");
        }
        return jsonObject;
    }

}
