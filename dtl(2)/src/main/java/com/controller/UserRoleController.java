package com.controller;

import com.alibaba.fastjson.JSONObject;
import com.bean.UserRole;
import com.mapper.UserRoleMapper;
import com.service.UserRoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;


@Controller
public class UserRoleController {

    @Autowired
    UserRoleService userRoleService;
    @Autowired
    UserRoleMapper userRoleMapper;

    @RequestMapping("/selectUserRole")
    @ResponseBody
    public JSONObject selectUserRole(UserRole userRole) {
        JSONObject jsonObject = new JSONObject();
//        session.setAttribute("userRoleList",userRoleService.getUserRole(userRole));
        jsonObject.put("userRoleList", userRoleService.getUserRole(userRole));
        return jsonObject;
    }

    @RequestMapping("/insertUserRole")
    @ResponseBody
    public JSONObject insertUserRole(UserRole userRole) {
        JSONObject jsonObject = new JSONObject();
        Integer result = userRoleMapper.insert(userRole);
        if (result > 0 ) {
            jsonObject.put("info", "插入成功");
        } else {
            jsonObject.put("info", "插入失败");
        }
        return jsonObject;
    }

    @RequestMapping("/deleteUserRole")
    @ResponseBody
    public JSONObject deleteUserRole(UserRole userRole) {
        JSONObject jsonObject = new JSONObject();
        Integer result = userRoleMapper.delete(userRole);
        if (result > 0 ) {
            jsonObject.put("info", "删除成功");
        } else {
            jsonObject.put("info", "删除失败");
        }
        return jsonObject;
    }

    @RequestMapping("/updateUserRole")
    @ResponseBody
    public JSONObject updateUserRole(UserRole userRole) {
        JSONObject jsonObject = new JSONObject();
        Integer result = userRoleMapper.updateByPrimaryKeySelective(userRole);
        if (result > 0 ) {
            jsonObject.put("info", "更新成功");
        } else {
            jsonObject.put("info", "更新失败");
        }
        return jsonObject;
    }

}
