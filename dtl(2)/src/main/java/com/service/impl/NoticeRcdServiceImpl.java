package com.service.impl;

import com.bean.NoticeRcd;
import com.mapper.NoticeRcdMapper;
import com.service.NoticeRcdService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service("NoticeRcdService")
public class NoticeRcdServiceImpl implements NoticeRcdService {

    @Autowired
    NoticeRcdMapper noticeRcdMapper;

    public List<NoticeRcd> getNoticeRcd(NoticeRcd noticeRcd){
        return noticeRcdMapper.getNoticeRcd(noticeRcd);
    }

}
