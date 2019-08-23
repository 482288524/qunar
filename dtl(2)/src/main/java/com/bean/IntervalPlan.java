package com.bean;



import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

@Data
@Entity
@Table(name = "t_interval_plan")
public class IntervalPlan implements Serializable {

    @Id
    @Column(name = "interval_plan_id")
    private Integer intervalPlanId;
    @Column(name = "plan_name")
    private String planName;
}
