package com.service.impl;

import com.bean.BusinessInfo;
import com.mapper.BusinessInfoMapper;
import com.service.BusinessInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service("BusinessInfoService")
public class BusinessInfoServiceImpl implements BusinessInfoService {

    @Autowired
    BusinessInfoMapper businessInfoMapper;

    public List<BusinessInfo> getBusinessInfo(BusinessInfo businessInfo){
        return businessInfoMapper.getBusinessInfo(businessInfo);
    }

}
