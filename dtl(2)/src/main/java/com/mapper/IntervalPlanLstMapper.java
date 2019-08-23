package com.mapper;


import com.bean.IntervalPlanLst;
import org.apache.ibatis.annotations.Param;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;
import java.util.Map;

public interface IntervalPlanLstMapper extends Mapper<IntervalPlanLst> {

    List<IntervalPlanLst> getIntervalPlanLst(@Param("intervalPlanLst") IntervalPlanLst intervalPlanLst);

    List<IntervalPlanLst> findByDepartment(@Param("id") Integer id);

    List<String> getDPartAllInterval(Integer departmentId);

    List<Map<String,Object>> getDPartIntervalPlan(Integer departmentId);

    List<Map<String,Object>> getDpMsgAndIntPlanLst();

    Integer updateNum(Integer id);

    Integer updateAddNum(Integer id);
}
