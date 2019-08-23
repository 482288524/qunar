package com.service.impl;

import com.bean.Patient;
import com.mapper.PatientMapper;
import com.service.PatientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service("PatientService")
public class PatientServiceImpl implements PatientService {

    @Autowired
    PatientMapper patientMapper;

    public List<Patient> getPatient(Patient patient){
        return patientMapper.getPatient(patient);
    }

}
