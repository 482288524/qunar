package com.service.impl;

import com.bean.PriorityConditionSet;
import com.mapper.PriorityConditionSetMapper;
import com.service.PriorityConditionSetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service("PriorityConditionSetService")
public class PriorityConditionSetServiceImpl implements PriorityConditionSetService {

    @Autowired
    PriorityConditionSetMapper priorityConditionSetMapper;

    public List<PriorityConditionSet> getPriorityConditionSet(PriorityConditionSet priorityConditionSet){
        return priorityConditionSetMapper.getPriorityConditionSet(priorityConditionSet);
    }

}
