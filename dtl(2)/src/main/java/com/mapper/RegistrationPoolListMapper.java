package com.mapper;


import com.bean.RegistrationPoolList;
import org.apache.ibatis.annotations.Param;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

public interface RegistrationPoolListMapper extends Mapper<RegistrationPoolList> {

    List<RegistrationPoolList> getRegistrationPoolList(@Param("registrationPoolList") RegistrationPoolList registrationPoolList);

}
