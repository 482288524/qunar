package com.mapper;


import com.bean.AdminInfo;
import org.apache.ibatis.annotations.Param;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

public interface AdminInfoMapper extends Mapper<AdminInfo> {

    List<AdminInfo> getAdminInfo(@Param("adminInfo") AdminInfo adminInfo);

}
