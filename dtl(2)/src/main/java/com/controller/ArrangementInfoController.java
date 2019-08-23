package com.controller;

import com.alibaba.fastjson.JSONObject;
import com.bean.ArrangementInfo;
import com.mapper.ArrangementInfoMapper;
import com.service.ArrangementInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
public class ArrangementInfoController {

    @Autowired
    ArrangementInfoService arrangementInfoService;
    @Autowired
    ArrangementInfoMapper arrangementInfoMapper;

    @RequestMapping("/selectArrangementInfo")
    @ResponseBody
    public JSONObject selectArrangementInfo(ArrangementInfo arrangementInfo) {
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("arrangementInfoList", arrangementInfoService.getArrangementInfo(arrangementInfo));
        return jsonObject;
    }

    @RequestMapping("/insertArrangementInfo")
    @ResponseBody
    public JSONObject insertArrangementInfo(ArrangementInfo arrangementInfo) {
        JSONObject jsonObject = new JSONObject();
        Integer result = arrangementInfoMapper.insert(arrangementInfo);
        if (result > 0 ) {
            jsonObject.put("info", "插入成功");
        } else {
            jsonObject.put("info", "插入失败");
        }
        return jsonObject;
    }

    @RequestMapping("/deleteArrangementInfo")
    @ResponseBody
    public JSONObject deleteArrangementInfo(ArrangementInfo arrangementInfo) {
        JSONObject jsonObject = new JSONObject();
        Integer result = arrangementInfoMapper.delete(arrangementInfo);
        if (result > 0 ) {
            jsonObject.put("info", "删除成功");
        } else {
            jsonObject.put("info", "删除失败");
        }
        return jsonObject;
    }

    @RequestMapping("/updateArrangementInfo")
    @ResponseBody
    public JSONObject updateArrangementInfo(ArrangementInfo arrangementInfo) {
        JSONObject jsonObject = new JSONObject();
        Integer result = arrangementInfoMapper.updateByPrimaryKeySelective(arrangementInfo);
        if (result > 0 ) {
            jsonObject.put("info", "更新成功");
        } else {
            jsonObject.put("info", "更新失败");
        }
        return jsonObject;
    }

}
