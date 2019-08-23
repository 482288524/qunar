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
@Table(name = "t_appointment_pool")
public class AppointmentPool implements Serializable {

    @Id
    private Long id;
    @Column(name = "pool_list_id")
    private Long poolListId;
    @Column(name = "bgn_tm")
    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")
    private Date bgnTm;
    @Column(name = "end_tm")
    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")
    private Date endTm;
    @Column(name = "serial_no")
    private Integer serialNo;
    @Column(name = "bill_no")
    private String billNo;
    @Column(name = "if_use")
    private Integer ifUse;

}