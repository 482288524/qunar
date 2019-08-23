package com.mapper;


import com.bean.ArrangementInfo;
import org.apache.ibatis.annotations.Param;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

public interface ArrangementInfoMapper extends Mapper<ArrangementInfo> {

    List<ArrangementInfo> getArrangementInfo(@Param("arrangementInfo") ArrangementInfo arrangementInfo);

}
