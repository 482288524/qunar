package com.mapper;


import com.bean.QueueInfo;
import org.apache.ibatis.annotations.Param;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

public interface QueueInfoMapper extends Mapper<QueueInfo> {

    List<QueueInfo> getQueueInfo(@Param("queueInfo") QueueInfo queueInfo);

}
