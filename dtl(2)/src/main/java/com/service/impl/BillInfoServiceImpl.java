package com.service.impl;

import com.bean.BillInfo;
import com.mapper.BillInfoMapper;
import com.service.BillInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service("BillInfoService")
public class BillInfoServiceImpl implements BillInfoService {

    @Autowired
    BillInfoMapper billInfoMapper;

    public List<BillInfo> getBillInfo(BillInfo billInfo){
        return billInfoMapper.getBillInfo(billInfo);
    }

}
