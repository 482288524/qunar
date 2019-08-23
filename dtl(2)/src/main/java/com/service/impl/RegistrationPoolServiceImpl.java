package com.service.impl;

import com.bean.RegistrationPool;
import com.mapper.RegistrationPoolMapper;
import com.service.RegistrationPoolService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service("RegistrationPoolService")
public class RegistrationPoolServiceImpl implements RegistrationPoolService {

    @Autowired
    RegistrationPoolMapper registrationPoolMapper;

    public List<RegistrationPool> getRegistrationPool(RegistrationPool registrationPool){
        return registrationPoolMapper.getRegistrationPool(registrationPool);
    }

}
