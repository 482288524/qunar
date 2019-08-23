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
@Table(name = "t_queue_info")
public class QueueInfo implements Serializable {

    @Id
    @Column(name = "queue_id")
    private Long queueId;
    @Column(name = "pool_list_id")
    private Long poolListId;
    @Column(name = "serial_tm")
    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")
    private Date serialTm;
    @Column(name = "bill_no")
    private String billNo;
    @Column(name = "queue_no")
    private String queueNo;
    @Column(name = "enqueue_tm")
    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")
    private Date enqueueTm;
    @Column(name = "dequeue_tm")
    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")
    private Date dequeueTm;
    @Column(name = "status")
    private Integer status;
    @Column(name = "consultation_id")
    private Integer consultationId;
    @Column(name = "doctor_id")
    private Integer doctorId;
}
