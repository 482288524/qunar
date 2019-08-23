package com.mapper;


import com.bean.User;
import org.apache.ibatis.annotations.Param;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

public interface UserMapper extends Mapper<User> {

    List<User> getUser(@Param("user") User user);

    Integer getCountByPhone(String phone);

}
