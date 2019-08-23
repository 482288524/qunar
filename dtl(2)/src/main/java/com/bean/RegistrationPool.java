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
@Table(name = "t_registration_pool")
public class RegistrationPool implements Serializable {

    @Id
    @Column(name = "pool_id")
    private Long poolId;
    @Column(name = "business_id")
    private String businessId;
    @Column(name = "pool_dt")
    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")
    private Date poolDt;
    @Column(name = "memo")
    private String memo;
}
