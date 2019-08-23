package com.mapper;


import com.bean.ConsultationBusiness;
import org.apache.ibatis.annotations.Param;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

public interface ConsultationBusinessMapper extends Mapper<ConsultationBusiness> {

    List<ConsultationBusiness> getConsultationBusiness(@Param("consultationBusiness") ConsultationBusiness consultationBusiness);

}
