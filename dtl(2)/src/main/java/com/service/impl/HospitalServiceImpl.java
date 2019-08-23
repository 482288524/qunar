package com.service.impl;

import com.bean.Hospital;
import com.mapper.HospitalMapper;
import com.service.HospitalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service("HospitalService")
public class HospitalServiceImpl implements HospitalService {

    @Autowired
    HospitalMapper hospitalMapper;

    public List<Hospital> getHospital(Hospital hospital){
        return hospitalMapper.getHospital(hospital);
    }

}
