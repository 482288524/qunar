package com.service.impl;

import com.bean.QueueInfo;
import com.mapper.QueueInfoMapper;
import com.service.QueueInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service("QueueInfoService")
public class QueueInfoServiceImpl implements QueueInfoService {

    @Autowired
    QueueInfoMapper queueInfoMapper;

    public List<QueueInfo> getQueueInfo(QueueInfo queueInfo){
        return queueInfoMapper.getQueueInfo(queueInfo);
    }

}
