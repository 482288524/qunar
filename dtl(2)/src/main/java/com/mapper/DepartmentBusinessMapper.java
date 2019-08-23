package com.mapper;


import com.bean.DepartmentBusiness;
import org.apache.ibatis.annotations.Param;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;
import java.util.Map;


public interface DepartmentBusinessMapper extends Mapper<DepartmentBusiness> {

    List<DepartmentBusiness> getDepartmentBusiness(@Param("departmentBusiness") DepartmentBusiness departmentBusiness);

}
