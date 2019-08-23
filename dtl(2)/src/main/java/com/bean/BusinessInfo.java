package com.bean;



import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

@Data
@Entity
@Table(name = "t_business_info")
public class BusinessInfo implements Serializable {

    @Id
    @Column(name = "business_id")
    private Integer businessId;
    @Column(name = "interval_plan_id")
    private Integer intervalPlanId;
    @Column(name = "department_id")
    private String departmentId;
    @Column(name = "business_name")
    private String businessName;
    @Column(name = "business_type")
    private Integer businessType;
    @Column(name = "business_flag")
    private Integer businessFlag;
    @Column(name = "prefix_queue_no")
    private String prefixQueueNo;
    @Column(name = "prefix_priority_no")
    private String prefixPriorityNo;
    @Column(name = "memo")
    private String memo;
    @Column(name = "week_set")
    private Integer weekSet;

    public Integer getBusinessId() {
        return businessId;
    }

    public void setBusinessId(Integer businessId) {
        this.businessId = businessId;
    }

    public Integer getIntervalPlanId() {
        return intervalPlanId;
    }

    public void setIntervalPlanId(Integer intervalPlanId) {
        this.intervalPlanId = intervalPlanId;
    }

    public String getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentId(String departmentId) {
        this.departmentId = departmentId;
    }

    public String getBusinessName() {
        return businessName;
    }

    public void setBusinessName(String businessName) {
        this.businessName = businessName;
    }

    public Integer getBusinessType() {
        return businessType;
    }

    public void setBusinessType(Integer businessType) {
        this.businessType = businessType;
    }

    public Integer getBusinessFlag() {
        return businessFlag;
    }

    public void setBusinessFlag(Integer businessFlag) {
        this.businessFlag = businessFlag;
    }

    public String getPrefixQueueNo() {
        return prefixQueueNo;
    }

    public void setPrefixQueueNo(String prefixQueueNo) {
        this.prefixQueueNo = prefixQueueNo;
    }

    public String getPrefixPriorityNo() {
        return prefixPriorityNo;
    }

    public void setPrefixPriorityNo(String prefixPriorityNo) {
        this.prefixPriorityNo = prefixPriorityNo;
    }

    public String getMemo() {
        return memo;
    }

    public void setMemo(String memo) {
        this.memo = memo;
    }

    public Integer getWeekSet() {
        return weekSet;
    }

    public void setWeekSet(Integer weekSet) {
        this.weekSet = weekSet;
    }
}