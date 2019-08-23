package com.mapper;


import com.bean.UserRole;
import org.apache.ibatis.annotations.Param;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

public interface UserRoleMapper extends Mapper<UserRole> {
    
    List<UserRole> getUserRole(@Param("userRole") UserRole userRole);

}
