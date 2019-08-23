package com.mapper;


import com.bean.Card;
import org.apache.ibatis.annotations.Param;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

public interface CardMapper extends Mapper<Card> {

    List<Card> getCard(@Param("card") Card card);

}
