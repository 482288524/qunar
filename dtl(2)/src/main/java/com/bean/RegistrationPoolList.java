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
@Table(name = "t_registration_pool_list")
public class RegistrationPoolList implements Serializable {

    @Id
    @Column(name = "pool_list_id")
    private Long poolListId;
    @Column(name = "pool_id")
    private Long poolId;
    @Column(name = "bgn_tm")
    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")
    private Date bgnTm;
    @Column(name = "end_tm")
    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")
    private Date endTm;
    @Column(name = "registration_num")
    private Integer registrationNum;
    @Column(name = "add_num")
    private Integer addNum;
    @Column(name = "lock_num")
    private Integer lockNum;

}
