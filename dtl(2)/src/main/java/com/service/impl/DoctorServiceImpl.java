package com.service.impl;

import com.bean.Doctor;
import com.mapper.DoctorMapper;
import com.service.DoctorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service("DoctorService")
public class DoctorServiceImpl implements DoctorService {

    @Autowired
    DoctorMapper doctorMapper;

    public List<Doctor> getDoctor(Doctor doctor){
        return doctorMapper.getDoctor(doctor);
    }

}
