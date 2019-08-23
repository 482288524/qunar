package com.bean;



import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

@Data
@Entity
@Table(name = "t_role")
public class Role implements Serializable {

    @Id
    @Column(name = "role_id")
    private Integer roleId;
    @Column(name = "role_code")
    private String roleCode;
    @Column(name = "role_name")
    private String roleName;
    @Column(name = "flag")
    private Integer flag;
    @Column(name = "first_url")
    private String firstUrl;
}