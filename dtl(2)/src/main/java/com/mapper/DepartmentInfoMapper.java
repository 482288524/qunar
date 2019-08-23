package com.mapper;


import com.bean.DepartmentInfo;


import org.apache.ibatis.annotations.Param;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;
import java.util.Map;


public interface DepartmentInfoMapper extends Mapper<DepartmentInfo> {

    List<DepartmentInfo> getDepartmentInfo(@Param("departmentInfo") DepartmentInfo departmentInfo);

    List<String> getAllDepartmentType();

    List<Map<String,Object>> getDepartmentNameByType(String type);

    Integer getDepartmentId(String departmentName);
}
