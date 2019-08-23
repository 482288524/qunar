package com.mapper;


import com.bean.Hospital;
import org.apache.ibatis.annotations.Param;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

public interface HospitalMapper extends Mapper<Hospital> {

    List<Hospital> getHospital(@Param("hospital") Hospital hospital);

}
