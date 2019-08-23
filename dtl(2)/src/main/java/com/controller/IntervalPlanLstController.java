package com.controller;

import com.alibaba.fastjson.JSONObject;
import com.bean.BusinessInfo;
import com.bean.IntervalPlanLst;
import com.mapper.BusinessInfoMapper;
import com.mapper.DepartmentInfoMapper;
import com.mapper.IntervalPlanLstMapper;
import com.service.IntervalPlanLstService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.*;


@Controller
public class IntervalPlanLstController {

    @Autowired
    IntervalPlanLstService intervalPlanLstService;
    @Autowired
    IntervalPlanLstMapper intervalPlanLstMapper;
    @Autowired
    BusinessInfoMapper businessInfoMapper;
    @Autowired
    DepartmentInfoMapper departmentInfoMapper;

    @RequestMapping("/selectIntervalPlanLst")
    @ResponseBody
    public JSONObject selectIntervalPlanLst(IntervalPlanLst intervalPlanLst) {
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("intervalPlanLstList",intervalPlanLstService.getIntervalPlanLst(intervalPlanLst));
        return jsonObject;
    }

    @RequestMapping("/selectIntervalPlanLst2")
    @ResponseBody
    public JSONObject selectIntervalPlanLst2() {
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("intervalPlanLstList",intervalPlanLstMapper.getDpMsgAndIntPlanLst());
        return jsonObject;
    }

    @RequestMapping("/selectByDepartment")
    @ResponseBody
    public JSONObject selectByDepartment(Integer id) {
        JSONObject jsonObject = new JSONObject();
        Calendar calendar = Calendar.getInstance();
        int tWeek = calendar.get(Calendar.DAY_OF_WEEK);
        List<String> interval = intervalPlanLstMapper.getDPartAllInterval(id);
        List<Map<String,Object>> plan = intervalPlanLstMapper.getDPartIntervalPlan(id);
        List<List<String>> result = new ArrayList<>();
        for(int i = 0 ; i < interval.size() ; i++){
            List<String> list = new ArrayList<>();
            list.add(interval.get(i));
            int n = 0;
            while(n < 7){
                for(int j = 0 ; j < plan.size() ; j++){
                    if((Integer)plan.get(j).get("weekSet") == tWeek && interval.get(i).equals((String)plan.get(j).get("time"))){
                        int num = (Integer)plan.get(j).get("registrationNum");
                        if(num == 0){
                            list.add("已约满");
                        }else{
                            list.add((Integer)plan.get(j).get("interPlanId") + "-剩余号源数:"+num);
                        }
                        break;
                    }else if(j == plan.size() - 1){
                        list.add("");
                    }
                }
                tWeek = (tWeek + 1) % 7;
                n++;
            }
            result.add(list);
        }
        jsonObject.put("intervalPlanLstList",result);
        return jsonObject;
    }

    @RequestMapping("/insertIntervalPlanLst")
    @ResponseBody
    public JSONObject insertIntervalPlanLst(IntervalPlanLst intervalPlanLst,Integer week,String departmentName) {
        JSONObject jsonObject = new JSONObject();
        Integer departmentId = departmentInfoMapper.getDepartmentId(departmentName);
        Map<String,Object> map = new HashMap<>();
        map.put("departmentId",departmentId);
        map.put("week",week);
        map.put("bgnTime",intervalPlanLst.getBgnTm());
        map.put("endTime",intervalPlanLst.getEndTm());
        Integer count = businessInfoMapper.countIntervalPlanNum(map);
        if(count != null && count > 0){
            jsonObject.put("info","该时间段已存在!");
            return jsonObject;
        }
        Integer nextPlanId = businessInfoMapper.getNextPlanId(departmentId);
        if(nextPlanId == null){
            nextPlanId = departmentId * 100 + 1;
        }
        intervalPlanLst.setIntervalPlanId(nextPlanId);
        Integer result = intervalPlanLstMapper.insert(intervalPlanLst);
        BusinessInfo businessInfo = new BusinessInfo();
        businessInfo.setIntervalPlanId(nextPlanId);
        businessInfo.setDepartmentId(departmentId + "");
        if(nextPlanId % 100 < 10){
            businessInfo.setBusinessName(departmentName + "业务0" + nextPlanId % 100 );
        }else{
            businessInfo.setBusinessName(departmentName + "业务" + nextPlanId % 100 );
        }
        businessInfo.setWeekSet(week);
        businessInfoMapper.insert(businessInfo);
        if(result > 0){
            jsonObject.put("info","添加成功!");
        }else{
            jsonObject.put("info","添加失败!");
        }
        return jsonObject;
    }

    @RequestMapping("/deleteIntervalPlanLst")
    @ResponseBody
    public JSONObject deleteIntervalPlanLst(IntervalPlanLst intervalPlanLst) {
        JSONObject jsonObject = new JSONObject();
        Integer result = intervalPlanLstMapper.delete(intervalPlanLst);
        if(result > 0){
            jsonObject.put("info","删除成功!");
        }else{
            jsonObject.put("info","删除失败!");
        }
        return jsonObject;
    }

    @RequestMapping("/updateIntervalPlanLst")
    @ResponseBody
    public JSONObject updateIntervalPlanLst(IntervalPlanLst intervalPlanLst) {
        JSONObject jsonObject = new JSONObject();
        Integer result = intervalPlanLstMapper.updateByPrimaryKeySelective(intervalPlanLst);
        if(result > 0){
            jsonObject.put("info","修改成功!");
        }else{
            jsonObject.put("info","修改失败!");
        }
        return jsonObject;
    }
}
