package com.bean;

import lombok.Data;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

@Data
@Entity
@Table(name = "t_interval_plan_lst")
public class IntervalPlanLst implements Serializable {

    @Id
    @Column(name = "plan_lst_id")
    private Integer planLstId;
    @Column(name = "interval_plan_id")
    private Integer intervalPlanId;
    @Column(name = "bgn_tm")
    private String bgnTm;
    @Column(name = "end_tm")
    private String endTm;
    @Column(name = "registration_num")
    private Integer registrationNum;

    public Integer getPlanLstId() {
        return planLstId;
    }

    public void setPlanLstId(Integer planLstId) {
        this.planLstId = planLstId;
    }

    public Integer getIntervalPlanId() {
        return intervalPlanId;
    }

    public void setIntervalPlanId(Integer intervalPlanId) {
        this.intervalPlanId = intervalPlanId;
    }

    public String getBgnTm() {
        return bgnTm;
    }

    public void setBgnTm(String bgnTm) {
        this.bgnTm = bgnTm;
    }

    public String getEndTm() {
        return endTm;
    }

    public void setEndTm(String endTm) {
        this.endTm = endTm;
    }

    public Integer getRegistrationNum() {
        return registrationNum;
    }

    public void setRegistrationNum(Integer registrationNum) {
        this.registrationNum = registrationNum;
    }
}
