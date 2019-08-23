package com.service.impl;

import com.bean.ConsultationBusiness;
import com.mapper.ConsultationBusinessMapper;
import com.service.ConsultationBusinessService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service("ConsultationBusinessService")
public class ConsultationBusinessServiceImpl implements ConsultationBusinessService {

    @Autowired
    ConsultationBusinessMapper consultationBusinessMapper;

    public List<ConsultationBusiness> getConsultationBusiness(ConsultationBusiness consultationBusiness){
        return consultationBusinessMapper.getConsultationBusiness(consultationBusiness);
    }

}
