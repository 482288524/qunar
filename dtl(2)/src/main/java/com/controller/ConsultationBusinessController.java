package com.controller;

import com.alibaba.fastjson.JSONObject;
import com.bean.ConsultationBusiness;
import com.mapper.ConsultationBusinessMapper;
import com.service.ConsultationBusinessService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
public class ConsultationBusinessController {

    @Autowired
    ConsultationBusinessService consultationBusinessService;
    @Autowired
    ConsultationBusinessMapper consultationBusinessMapper;

    @RequestMapping("/selectConsultationBusiness")
    @ResponseBody
    public JSONObject selectConsultationBusiness(ConsultationBusiness consultationBusiness) {
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("consultationBusinessList", consultationBusinessService.getConsultationBusiness(consultationBusiness));
        return jsonObject;
    }

    @RequestMapping("/insertConsultationBusiness")
    @ResponseBody
    public JSONObject insertConsultationBusiness(ConsultationBusiness consultationBusiness) {
        JSONObject jsonObject = new JSONObject();
        Integer result = consultationBusinessMapper.insert(consultationBusiness);
        if (result > 0) {
            jsonObject.put("info", "插入成功");
        } else {
            jsonObject.put("info", "插入失败");
        }
        return jsonObject;
    }

    @RequestMapping("/deleteConsultationBusiness")
    @ResponseBody
    public JSONObject deleteConsultationBusiness(ConsultationBusiness consultationBusiness) {
        JSONObject jsonObject = new JSONObject();
        Integer result = consultationBusinessMapper.delete(consultationBusiness);
        if (result > 0) {
            jsonObject.put("info", "删除成功");
        } else {
            jsonObject.put("info", "删除失败");
        }
        return jsonObject;
    }

    @RequestMapping("/updateConsultationBusiness")
    @ResponseBody
    public JSONObject updateConsultationBusiness(ConsultationBusiness consultationBusiness) {
        JSONObject jsonObject = new JSONObject();
        Integer result = consultationBusinessMapper.updateByPrimaryKeySelective(consultationBusiness);
        if (result > 0) {
            jsonObject.put("info", "更新成功");
        } else {
            jsonObject.put("info", "更新失败");
        }
        return jsonObject;
    }

}
