package com.bean;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

@Data
@Entity
@Table(name = "t_department_info")
public class DepartmentInfo implements Serializable {

    @Id
    @Column(name = "department_id")
    private Long departmentId;
    @Column(name = "department_type")
    private String departmentType;
    @Column(name = "department_name")
    private String departmentName;
    @Column(name = "department_status")
    private Integer departmentStatus;
    @Column(name = "memo")
    private String memo;

}