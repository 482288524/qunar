package com.mapper;


import com.bean.BusinessInfo;
import org.apache.ibatis.annotations.Param;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;
import java.util.Map;

public interface BusinessInfoMapper extends Mapper<BusinessInfo> {

    List<BusinessInfo> getBusinessInfo(@Param("businessInfo") BusinessInfo businessInfo);

    Integer delInterPlanLstById(Integer planId);

    Integer getNextPlanId(Integer departmentId);

    Integer countIntervalPlanNum(Map<String,Object> map);
}
