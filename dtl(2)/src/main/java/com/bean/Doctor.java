package com.bean;



import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

@Data
@Entity
@Table(name = "t_doctor")
public class Doctor implements Serializable {

    @Id
    @Column(name = "doctor_id")
    private Integer doctorId;
    @Column(name = "job_no")
    private String jobNo;
    @Column(name = "real_name")
    private String realName;
    @Column(name = "email")
    private String email;
    @Column(name = "phone_number")
    private String phoneNumber;
//    @Column(name = "password")
//    private String password;
    @Column(name = "department_id")
    private String departmentId;
    @Column(name = "post")
    private String post;
    @Column(name = "title")
    private String title;
    @Column(name = "sex")
    private String sex;
    @Column(name = "memo")
    private String memo;

}