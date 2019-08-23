package com.mapper;


import com.bean.ConsultationRoomInfo;
import org.apache.ibatis.annotations.Param;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

public interface ConsultationRoomInfoMapper extends Mapper<ConsultationRoomInfo> {

    List<ConsultationRoomInfo> getConsultationRoomInfo(@Param("consultationRoomInfo") ConsultationRoomInfo consultationRoomInfo);

}
