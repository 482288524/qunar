package com.service.impl;

import com.bean.IntervalPlanLst;
import com.mapper.IntervalPlanLstMapper;
import com.service.IntervalPlanLstService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service("IntervalPlanLstService")
public class IntervalPlanLstServiceImpl implements IntervalPlanLstService {

    @Autowired
    IntervalPlanLstMapper intervalPlanLstMapper;

    @Override
    public List<IntervalPlanLst> getIntervalPlanLst(IntervalPlanLst intervalPlanLst) {
        return intervalPlanLstMapper.getIntervalPlanLst(intervalPlanLst);
    }
}
