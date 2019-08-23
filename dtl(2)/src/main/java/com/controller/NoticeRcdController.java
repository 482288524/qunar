package com.controller;

import com.alibaba.fastjson.JSONObject;
import com.bean.NoticeRcd;
import com.mapper.NoticeRcdMapper;
import com.service.NoticeRcdService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
public class NoticeRcdController {

    @Autowired
    NoticeRcdService noticeRcdService;
    @Autowired
    NoticeRcdMapper noticeRcdMapper;

    @RequestMapping("/selectNoticeRcd")
    @ResponseBody
    public JSONObject selectNoticeRcd(NoticeRcd noticeRcd) {
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("noticeRcdList", noticeRcdService.getNoticeRcd(noticeRcd));
        return jsonObject;
    }

    @RequestMapping("/insertNoticeRcd")
    @ResponseBody
    public JSONObject insertNoticeRcd(NoticeRcd noticeRcd) {
        JSONObject jsonObject = new JSONObject();
        Integer result = noticeRcdMapper.insert(noticeRcd);
        if (result > 0 ) {
            jsonObject.put("info", "插入成功");
        } else {
            jsonObject.put("info", "插入失败");
        }
        return jsonObject;
    }

    @RequestMapping("/deleteNoticeRcd")
    @ResponseBody
    public JSONObject deleteNoticeRcd(NoticeRcd noticeRcd) {
        JSONObject jsonObject = new JSONObject();
        Integer result = noticeRcdMapper.delete(noticeRcd);
        if (result > 0 ) {
            jsonObject.put("info", "删除成功");
        } else {
            jsonObject.put("info", "删除失败");
        }
        return jsonObject;
    }

    @RequestMapping("/updateNoticeRcd")
    @ResponseBody
    public JSONObject updateNoticeRcd(NoticeRcd noticeRcd) {
        JSONObject jsonObject = new JSONObject();
        Integer result = noticeRcdMapper.updateByPrimaryKeySelective(noticeRcd);
        if (result > 0 ) {
            jsonObject.put("info", "更新成功");
        } else {
            jsonObject.put("info", "更新失败");
        }
        return jsonObject;
    }

}
