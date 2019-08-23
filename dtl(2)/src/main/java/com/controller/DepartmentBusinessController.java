package com.controller;

import com.alibaba.fastjson.JSONObject;
import com.bean.DepartmentBusiness;
import com.mapper.DepartmentBusinessMapper;
import com.service.DepartmentBusinessService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
public class DepartmentBusinessController {

    @Autowired
    DepartmentBusinessService departmentBusinessService;
    @Autowired
    DepartmentBusinessMapper departmentBusinessMapper;

    @RequestMapping("/selectDepartmentBusiness")
    @ResponseBody
    public JSONObject selectDepartmentBusiness(DepartmentBusiness departmentBusiness) {
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("departmentBusinessList", departmentBusinessService.getDepartmentBusiness(departmentBusiness));
        return jsonObject;
    }

    @RequestMapping("/insertDepartmentBusiness")
    @ResponseBody
    public JSONObject insertDepartmentBusiness(DepartmentBusiness departmentBusiness) {
        JSONObject jsonObject = new JSONObject();
        Integer result = departmentBusinessMapper.insert(departmentBusiness);
        if (result > 0 ) {
            jsonObject.put("info", "插入成功");
        } else {
            jsonObject.put("info", "插入失败");
        }
        return jsonObject;
    }

    @RequestMapping("/deleteDepartmentBusiness")
    @ResponseBody
    public JSONObject deleteDepartmentBusiness(DepartmentBusiness departmentBusiness) {
        JSONObject jsonObject = new JSONObject();
        Integer result = departmentBusinessMapper.delete(departmentBusiness);
        if (result > 0 ) {
            jsonObject.put("info", "删除成功");
        } else {
            jsonObject.put("info", "删除失败");
        }
        return jsonObject;
    }

    @RequestMapping("/updateDepartmentBusiness")
    @ResponseBody
    public JSONObject updateDepartmentBusiness(DepartmentBusiness departmentBusiness) {
        JSONObject jsonObject = new JSONObject();
        Integer result = departmentBusinessMapper.updateByPrimaryKeySelective(departmentBusiness);
        if (result > 0 ) {
            jsonObject.put("info", "更新成功");
        } else {
            jsonObject.put("info", "更新失败");
        }
        return jsonObject;
    }

}
