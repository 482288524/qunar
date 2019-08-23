package com.mapper;


import com.bean.SysSet;
import org.apache.ibatis.annotations.Param;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

public interface SysSetMapper extends Mapper<SysSet> {

    List<SysSet> getSysSet(@Param("sysSet") SysSet sysSet);

}
