package com.controller;

import com.alibaba.fastjson.JSONObject;
import com.bean.Role;
import com.mapper.RoleMapper;
import com.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
public class RoleController {

    @Autowired
    RoleService roleService;
    @Autowired
    RoleMapper roleMapper;

    @RequestMapping("/selectRole")
    @ResponseBody
    public JSONObject selectRole(Role role) {
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("roleList", roleService.getRole(role));
        return jsonObject;
    }

    @RequestMapping("/insertRole")
    @ResponseBody
    public JSONObject insertRole(Role role) {
        JSONObject jsonObject = new JSONObject();
        Integer result = roleMapper.insert(role);
        if (result > 0 ) {
            jsonObject.put("info", "插入成功");
        } else {
            jsonObject.put("info", "插入失败");
        }
        return jsonObject;
    }

    @RequestMapping("/deleteRole")
    @ResponseBody
    public JSONObject deleteRole(Role role) {
        JSONObject jsonObject = new JSONObject();
        Integer result = roleMapper.delete(role);
        if (result > 0 ) {
            jsonObject.put("info", "删除成功");
        } else {
            jsonObject.put("info", "删除失败");
        }
        return jsonObject;
    }

    @RequestMapping("/updateRole")
    @ResponseBody
    public JSONObject updateRole(Role role) {
        JSONObject jsonObject = new JSONObject();
        Integer result = roleMapper.updateByPrimaryKeySelective(role);
        if (result > 0 ) {
            jsonObject.put("info", "更新成功");
        } else {
            jsonObject.put("info", "更新失败");
        }
        return jsonObject;
    }

}
