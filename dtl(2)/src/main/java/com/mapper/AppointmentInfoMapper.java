package com.mapper;


import com.bean.AppointmentInfo;
import org.apache.ibatis.annotations.Param;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

public interface AppointmentInfoMapper extends Mapper<AppointmentInfo> {

    List<AppointmentInfo> getAppointmentInfo(@Param("appointmentInfo") AppointmentInfo appointmentInfo);

}
