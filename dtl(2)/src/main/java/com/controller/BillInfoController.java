package com.controller;

import com.alibaba.fastjson.JSONObject;
import com.bean.BillInfo;
import com.mapper.BillInfoMapper;
import com.service.BillInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
public class BillInfoController {

    @Autowired
    BillInfoService billInfoService;
    @Autowired
    BillInfoMapper billInfoMapper;

    @RequestMapping("/selectBillInfo")
    @ResponseBody
    public JSONObject selectBillNo(BillInfo billInfo) {
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("billInfoList", billInfoService.getBillInfo(billInfo));
        return jsonObject;
    }

    @RequestMapping("/insertBillInfo")
    @ResponseBody
    public JSONObject insertBillInfo(BillInfo billInfo) {
        JSONObject jsonObject = new JSONObject();
        Integer result = billInfoMapper.insert(billInfo);
        if (result > 0 ) {
            jsonObject.put("info", "插入成功");
        } else {
            jsonObject.put("info", "插入失败");
        }
        return jsonObject;
    }

    @RequestMapping("/deleteBillInfo")
    @ResponseBody
    public JSONObject deleteBillInfo(BillInfo billInfo) {
        JSONObject jsonObject = new JSONObject();
        Integer result = billInfoMapper.delete(billInfo);
        if (result > 0 ) {
            jsonObject.put("info", "删除成功");
        } else {
            jsonObject.put("info", "删除失败");
        }
        return jsonObject;
    }

    @RequestMapping("/updateBillInfo")
    @ResponseBody
    public JSONObject updateBillInfo(BillInfo billInfo) {
        JSONObject jsonObject = new JSONObject();
        Integer result = billInfoMapper.updateByPrimaryKeySelective(billInfo);
        if (result > 0 ) {
            jsonObject.put("info", "更新成功");
        } else {
            jsonObject.put("info", "更新失败");
        }
        return jsonObject;
    }

}
