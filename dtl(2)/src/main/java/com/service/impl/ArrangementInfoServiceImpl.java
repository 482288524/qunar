package com.service.impl;

import com.bean.ArrangementInfo;
import com.mapper.ArrangementInfoMapper;
import com.service.ArrangementInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service("ArrangementInfoService")
public class ArrangementInfoServiceImpl implements ArrangementInfoService {

    @Autowired
    ArrangementInfoMapper arrangementInfoMapper;

    public List<ArrangementInfo> getArrangementInfo(ArrangementInfo arrangementInfo){
        return arrangementInfoMapper.getArrangementInfo(arrangementInfo);
    }

}
