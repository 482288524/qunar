package com.controller;

import com.alibaba.fastjson.JSONObject;
import com.bean.Patient;
import com.bean.PriorityConditionSet;
import com.bean.User;
import com.mapper.IntervalPlanLstMapper;
import com.mapper.PatientMapper;
import com.mapper.PriorityConditionSetMapper;
import com.mapper.UserMapper;
import com.service.PatientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class PatientController {

    @Autowired
    PatientService patientService;
    @Autowired
    PatientMapper patientMapper;
    @Autowired
    UserMapper userMapper;
    @Autowired
    IntervalPlanLstMapper intervalPlanLstMapper;
    @Autowired
    PriorityConditionSetMapper priorityConditionSetMapper;

    @RequestMapping("/selectPatient")
    @ResponseBody
    public JSONObject selectPatient(Patient patient) {
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("patientList",patientService.getPatient(patient));
        return jsonObject;
    }

    @PostMapping("/insertPatient")
    @ResponseBody
    public JSONObject insertPatient(Patient patient,Integer userId,Integer id) {
        JSONObject jsonObject = new JSONObject();
        User user = userMapper.selectByPrimaryKey(userId);
//        PriorityConditionSet priorityCondition = priorityConditionSetMapper.selectByPrimaryKey(priority);
        patient.setIntervalPlanId(id);
        patient.setRealName(user.getRealName());
        patient.setSex(user.getSex());
        patient.setPhoneNumber(user.getPhoneNumber());
//        patient.setPriority(priorityCondition.getConditionName());
        Integer result = patientMapper.insert(patient);
        intervalPlanLstMapper.updateNum(id);
        if (result >0 ){
            jsonObject.put("info","插入成功!");
        }else{
            jsonObject.put("info","插入失败!");
        }
        return jsonObject;
    }

    @RequestMapping("/deletePatient")
    @ResponseBody
    public JSONObject deletePatient(Patient patient) {
        JSONObject jsonObject = new JSONObject();
        intervalPlanLstMapper.updateAddNum(patientMapper.select(patient).get(0).getIntervalPlanId());
        Integer result = patientMapper.delete(patient);
        if (result >0 ){
            jsonObject.put("info","删除成功!");
        }else{
            jsonObject.put("info","删除失败!");
        }
        return jsonObject;
    }

    @RequestMapping("/updatePatient")
    @ResponseBody
    public JSONObject updatePatient(Patient patient) {
        JSONObject jsonObject = new JSONObject();
        Integer result = patientMapper.updateByPrimaryKeySelective(patient);
        if (result > 0 ){
            jsonObject.put("info","更新成功!");
        }else{
            jsonObject.put("info","更新失败!");
        }
        return jsonObject;
    }

    @RequestMapping("/updatePatientStatus")
    @ResponseBody
    public JSONObject updatePatientStatus(Integer patientId) {
        JSONObject jsonObject = new JSONObject();
        Integer result = patientMapper.updatePatientStatus(patientId);
        if (result > 0 ){
            jsonObject.put("info","操作成功!");
        }else{
            jsonObject.put("info","操作失败!");
        }
        return jsonObject;
    }

}
