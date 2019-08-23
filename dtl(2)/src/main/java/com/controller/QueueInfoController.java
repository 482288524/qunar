package com.controller;

import com.alibaba.fastjson.JSONObject;
import com.bean.QueueInfo;
import com.mapper.QueueInfoMapper;
import com.service.QueueInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
public class QueueInfoController {

    @Autowired
    QueueInfoService queueInfoService;
    @Autowired
    QueueInfoMapper queueInfoMapper;

    @RequestMapping("/selectQueueInfo")
    @ResponseBody
    public JSONObject selectQueueInfo(QueueInfo queueInfo) {
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("queueInfoList", queueInfoService.getQueueInfo(queueInfo));
        return jsonObject;
    }

    @RequestMapping("/insertQueueInfo")
    @ResponseBody
    public JSONObject insertQueueInfo(QueueInfo queueInfo) {
        JSONObject jsonObject = new JSONObject();
        Integer result = queueInfoMapper.insert(queueInfo);
        if (result > 0) {
            jsonObject.put("info", "插入成功!");
        } else {
            jsonObject.put("info", "插入失败!");
        }
        return jsonObject;
    }

    @RequestMapping("/deleteQueueInfo")
    @ResponseBody
    public JSONObject deleteQueueInfo(QueueInfo queueInfo) {
        JSONObject jsonObject = new JSONObject();
        Integer result = queueInfoMapper.delete(queueInfo);
        if (result > 0) {
            jsonObject.put("info", "删除成功!");
        } else {
            jsonObject.put("info", "删除失败!");
        }
        return jsonObject;
    }

    @RequestMapping("/updateQueueInfo")
    @ResponseBody
    public JSONObject updateQueueInfo(QueueInfo queueInfo) {
        JSONObject jsonObject = new JSONObject();
        Integer result = queueInfoMapper.updateByPrimaryKeySelective(queueInfo);
        if (result > 0) {
            jsonObject.put("info", "更新成功!");
        } else {
            jsonObject.put("info", "更新失败!");
        }
        return jsonObject;
    }

}
