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
@Table(name = "t_appointment_info")
public class AppointmentInfo implements Serializable {

    @Id
    @Column(name = "appointment_id")
    private Long appointmentId;
    @Column(name = "pool_list_id")
    private Long poolListId;
    @Column(name = "bill_no")
    private String billNo;
    @Column(name = "enqueue_tm")
    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")
    private Date enqueueTm;
    @Column(name = "status")
    private Integer status;
    @Column(name = "pool_num")
    private Integer poolNum;

}