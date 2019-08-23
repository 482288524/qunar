package com.mapper;


import com.bean.IntervalPlan;
import org.apache.ibatis.annotations.Param;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

public interface IntervalPlanMapper extends Mapper<IntervalPlan> {

    List<IntervalPlan> getIntervalPlan(@Param("intervalPlan") IntervalPlan intervalPlan);

}
