package com.bean;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.math.BigDecimal;

@Data
@Entity
@Table(name = "t_department_business")
public class DepartmentBusiness implements Serializable {

    @Id
    @Column(name = "db_id")
    private BigDecimal dbId;
    @Column(name = "business_id")
    private String businessId;
    @Column(name = "department_id")
    private Long departmentId;
}