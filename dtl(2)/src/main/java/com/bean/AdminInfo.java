package com.bean;



import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

@Data
@Entity
@Table(name = "t_admin_info")
public class AdminInfo implements Serializable {

    @Id
    private Integer id;
    @Column(name = "real_name")
    private String realName;
    @Column(name = "phone_number")
    private String phoneNumber;
    @Column(name = "password")
    private String password;
    @Column(name = "flag")
    private Integer flag;
    @Column(name = "email")
    private String email;

}