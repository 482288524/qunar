package com.mapper;


import com.bean.RegistrationPool;
import org.apache.ibatis.annotations.Param;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

public interface RegistrationPoolMapper extends Mapper<RegistrationPool> {

    List<RegistrationPool> getRegistrationPool(@Param("registrationPool") RegistrationPool registrationPool);

}
