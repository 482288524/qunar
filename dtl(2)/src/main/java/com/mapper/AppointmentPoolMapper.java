package com.mapper;


import com.bean.AppointmentPool;
import org.apache.ibatis.annotations.Param;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

public interface AppointmentPoolMapper extends Mapper<AppointmentPool> {

    List<AppointmentPool> getAppointmentPool(@Param("appointmentPool") AppointmentPool appointmentPool);

}
