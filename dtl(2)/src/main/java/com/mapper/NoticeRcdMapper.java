package com.mapper;


import com.bean.NoticeRcd;
import org.apache.ibatis.annotations.Param;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

public interface NoticeRcdMapper extends Mapper<NoticeRcd> {

    List<NoticeRcd> getNoticeRcd(@Param("noticeRcd") NoticeRcd noticeRcd);

}
