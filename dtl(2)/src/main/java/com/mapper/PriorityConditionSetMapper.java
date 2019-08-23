package com.mapper;


import com.bean.PriorityConditionSet;
import org.apache.ibatis.annotations.Param;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

public interface PriorityConditionSetMapper extends Mapper<PriorityConditionSet> {

    List<PriorityConditionSet> getPriorityConditionSet(@Param("priorityConditionSet") PriorityConditionSet priorityConditionSet);
}
