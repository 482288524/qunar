package com.service.impl;

import com.bean.SysSet;
import com.mapper.SysSetMapper;
import com.service.SysSetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service("SysSetService")
public class SysSetServiceImpl implements SysSetService {

    @Autowired
    SysSetMapper sysSetMapper;

    public List<SysSet> getSysSet(SysSet sysSet){
        return sysSetMapper.getSysSet(sysSet);
    }

}
