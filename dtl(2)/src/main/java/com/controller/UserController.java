package com.controller;

import com.alibaba.fastjson.JSONObject;
import com.bean.User;
import com.bean.UserRole;
import com.mapper.UserMapper;
import com.mapper.UserRoleMapper;
import com.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
public class UserController {

    @Autowired
    UserService userService;
    @Autowired
    UserMapper userMapper;
    @Autowired
    UserRoleMapper userRoleMapper;

    @RequestMapping("/selectUser")
    @ResponseBody
    public JSONObject selectUser(User user) {
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("userList", userService.getUser(user));
        return jsonObject;
    }

    @RequestMapping("/insertUser")
    @ResponseBody
    public JSONObject insertUser(User user) {
        JSONObject jsonObject = new JSONObject();
        if(userMapper.getCountByPhone(user.getPhoneNumber()) > 0){
            jsonObject.put("info", "该手机号已存在!");
            return jsonObject;
        }
        Integer result = userMapper.insertSelective(user);
        UserRole userRole = new UserRole();
        userRole.setUserId(user.getUserId());
        userRole.setRoleId(3);
        userRole.setRealName(user.getRealName());
        userRoleMapper.insert(userRole);
        if (result > 0 ) {
            jsonObject.put("info", "注册成功");
        } else {
            jsonObject.put("info", "注册失败");
        }
        return jsonObject;
    }

    @RequestMapping("/deleteUser")
    @ResponseBody
    public JSONObject deleteUser(User user) {
        JSONObject jsonObject = new JSONObject();
        Integer result = userMapper.delete(user);
        if (result > 0 ) {
            jsonObject.put("info", "删除成功");
        } else {
            jsonObject.put("info", "删除失败");
        }
        return jsonObject;
    }

    @RequestMapping("/updateUser")
    @ResponseBody
    public JSONObject updateUser(User user) {
        JSONObject jsonObject = new JSONObject();
        Integer result = userMapper.updateByPrimaryKeySelective(user);
        if (result > 0 ) {
            jsonObject.put("info", "更新成功");
        } else {
            jsonObject.put("info", "更新失败");
        }
        return jsonObject;
    }

}
