package com.bean;



import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.util.Date;

@Data
@Entity
@Table(name = "t_notice_rcd")
public class NoticeRcd implements Serializable {

    @Id
    @Column(name = "notice_id")
    private Long noticeId;
    @Column(name = "queue_id")
    private Long queueId;
    @Column(name = "msg_tm")
    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")
    private Date msgTm;
    @Column(name = "content")
    private String content;
    @Column(name = "type")
    private Integer type;
}