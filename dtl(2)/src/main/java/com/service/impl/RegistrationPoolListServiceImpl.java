package com.service.impl;

import com.bean.RegistrationPoolList;
import com.mapper.RegistrationPoolListMapper;
import com.service.RegistrationPoolListService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service("RegistrationPoolListService")
public class RegistrationPoolListServiceImpl implements RegistrationPoolListService {

    @Autowired
    RegistrationPoolListMapper registrationPoolListMapper;

    public List<RegistrationPoolList> getRegistrationPoolList(RegistrationPoolList registrationPoolList){
        return registrationPoolListMapper.getRegistrationPoolList(registrationPoolList);
    }

}
