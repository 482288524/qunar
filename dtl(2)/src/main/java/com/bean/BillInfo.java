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
@Table(name = "t_bill_info")
public class BillInfo implements Serializable {

    @Id
    @Column(name = "bill_no")
    private String billNo;
    @Column(name = "queue_no")
    private String queueNo;
    @Column(name = "patient_id")
    private String patientId;
    @Column(name = "appointment_id")
    private Long appointmentId;
    @Column(name = "department_id")
    private String departmentId;
    @Column(name = "doctor_id")
    private Integer doctorId;
    @Column(name = "bill_tm")
    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")
    private Date billTm;
    @Column(name = "business_id")
    private String businessId;
    @Column(name = "conditions")
    private String conditions;
    @Column(name = "if_complete")
    private String ifComplete;
    @Column(name = "memo")
    private String memo;

}