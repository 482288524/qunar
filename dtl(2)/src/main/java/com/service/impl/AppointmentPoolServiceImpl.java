package com.service.impl;

import com.bean.AppointmentPool;
import com.mapper.AppointmentPoolMapper;
import com.service.AppointmentPoolService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service("AppointmentPoolService")
public class AppointmentPoolServiceImpl implements AppointmentPoolService {

    @Autowired
    AppointmentPoolMapper appointmentPoolMapper;

    public List<AppointmentPool> getAppointmentPool(AppointmentPool appointmentPool){
        return appointmentPoolMapper.getAppointmentPool(appointmentPool);
    }

}
