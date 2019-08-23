package com.service.impl;

import com.bean.IntervalPlan;
import com.mapper.IntervalPlanMapper;
import com.service.IntervalPlanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service("IntervalPlanService")
public class IntervalPlanServiceImpl implements IntervalPlanService {

    @Autowired
    IntervalPlanMapper intervalPlanMapper;

    public List<IntervalPlan> getIntervalPlan(IntervalPlan intervalPlan){
        return intervalPlanMapper.getIntervalPlan(intervalPlan);
    }
}
