package com.service.impl;

import com.bean.AppointmentInfo;
import com.mapper.AppointmentInfoMapper;
import com.service.AppointmentInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service("AppointmentInfoService")
public class AppointmentInfoServiceImpl implements AppointmentInfoService {

    @Autowired
    AppointmentInfoMapper appointmentInfoMapper;

    public List<AppointmentInfo> getAppointmentInfo(AppointmentInfo appointmentInfo){
        return appointmentInfoMapper.getAppointmentInfo(appointmentInfo);
    }

}
