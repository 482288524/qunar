package com.mapper;


import com.bean.Patient;
import org.apache.ibatis.annotations.Param;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

public interface PatientMapper extends Mapper<Patient> {

    List<Patient> getPatient(@Param("patient") Patient patient);

    Integer updatePatientStatus(Integer patientId);
}
