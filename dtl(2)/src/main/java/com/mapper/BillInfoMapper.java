package com.mapper;


import com.bean.BillInfo;
import org.apache.ibatis.annotations.Param;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

public interface BillInfoMapper extends Mapper<BillInfo> {

    List<BillInfo> getBillInfo(@Param("billInfo") BillInfo billInfo);

}
