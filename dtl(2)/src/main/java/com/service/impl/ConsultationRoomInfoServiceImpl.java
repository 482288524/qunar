package com.service.impl;

import com.bean.ConsultationRoomInfo;
import com.mapper.ConsultationRoomInfoMapper;
import com.service.ConsultationRoomInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service("ConsultationRoomInfoService")
public class ConsultationRoomInfoServiceImpl implements ConsultationRoomInfoService {

    @Autowired
    ConsultationRoomInfoMapper consultationRoomInfoMapper;

    public List<ConsultationRoomInfo> getConsultationRoomInfo(ConsultationRoomInfo consultationRoomInfo){
        return consultationRoomInfoMapper.getConsultationRoomInfo(consultationRoomInfo);
    }

}
