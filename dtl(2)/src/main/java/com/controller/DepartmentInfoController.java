package com.controller;

import com.alibaba.fastjson.JSONObject;
import com.bean.DepartmentInfo;
import com.mapper.DepartmentInfoMapper;
import com.service.DepartmentInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


@Controller
public class DepartmentInfoController {

    @Autowired
    DepartmentInfoService departmentInfoService;

    @Autowired
    DepartmentInfoMapper departmentInfoMapper;

    @RequestMapping("/selectDepartmentAllInfo")
    @ResponseBody
    public JSONObject selectDepartmentAllInfo(DepartmentInfo departmentInfo) {
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("departmentInfo", departmentInfoService.getDepartmentInfo(departmentInfo));
        return jsonObject;
    }

    @RequestMapping("/selectDepartmentInfo")
    @ResponseBody
    public JSONObject selectDepartmentInfo() {
        JSONObject jsonObject = new JSONObject();
        List<Map<String,Object>>  result = new ArrayList<>();
        List<String> types = departmentInfoMapper.getAllDepartmentType();
        if(types != null && types.size() > 0){
            for(int i = 0 ; i < types.size() ; i++){
                Map<String,Object> map = new HashMap<>();
                List<Map<String,Object>> names = departmentInfoMapper.getDepartmentNameByType(types.get(i));
                map.put("type",types.get(i));
                map.put("data",names);
                result.add(map);
            }
        }
        jsonObject.put("result",result);
        //jsonObject.put("departmentInfoList", departmentInfoService.getDepartmentInfo(departmentInfo));
        return jsonObject;
    }

    @RequestMapping("/insertDepartmentInfo")
    @ResponseBody
    public JSONObject insertDepartmentInfo(DepartmentInfo departmentInfo) {
        JSONObject jsonObject = new JSONObject();
        Integer result = departmentInfoMapper.insert(departmentInfo);
        if (result > 0) {
            jsonObject.put("info", "插入成功");
        } else {
            jsonObject.put("info", "插入失败");
        }
        return jsonObject;
    }

    @RequestMapping("/deleteDepartmentInfo")
    @ResponseBody
    public JSONObject deleteDepartmentInfo(DepartmentInfo departmentInfo) {
        JSONObject jsonObject = new JSONObject();
        Integer result = departmentInfoMapper.delete(departmentInfo);
        if (result > 0) {
            jsonObject.put("info", "删除成功");
        } else {
            jsonObject.put("info", "删除失败");
        }
        return jsonObject;
    }

    @RequestMapping("/updateDepartmentInfo")
    @ResponseBody
    public JSONObject updateDepartmentInfo(DepartmentInfo departmentInfo) {
        JSONObject jsonObject = new JSONObject();
        Integer result = departmentInfoMapper.updateByPrimaryKeySelective(departmentInfo);
        if (result > 0) {
            jsonObject.put("info", "更新成功");
        } else {
            jsonObject.put("info", "更新失败");
        }
        return jsonObject;
    }

}
