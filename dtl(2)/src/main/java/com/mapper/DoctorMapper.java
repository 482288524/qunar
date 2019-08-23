package com.mapper;


import com.bean.Doctor;
import org.apache.ibatis.annotations.Param;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

public interface DoctorMapper extends Mapper<Doctor> {

    List<Doctor> getDoctor(@Param("doctor") Doctor doctor);

}
