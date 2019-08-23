package com.bean;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

@Data
@Entity
@Table(name = "t_priority_condition_set")
public class PriorityConditionSet implements Serializable {

    @Id
    @Column(name = "condition_id")
    private Integer conditionId;
    @Column(name = "condition_name")
    private String conditionName;
    @Column(name = "minus_minutes")
    private Integer minusMinutes;
    @Column(name = "priority_type")
    private Integer priorityType;
    @Column(name = "condition_sql")
    private String conditionSql;

    public Integer getConditionId() {
        return conditionId;
    }

    public void setConditionId(Integer conditionId) {
        this.conditionId = conditionId;
    }

    public String getConditionName() {
        return conditionName;
    }

    public void setConditionName(String conditionName) {
        this.conditionName = conditionName;
    }

    public Integer getMinusMinutes() {
        return minusMinutes;
    }

    public void setMinusMinutes(Integer minusMinutes) {
        this.minusMinutes = minusMinutes;
    }

    public Integer getPriorityType() {
        return priorityType;
    }

    public void setPriorityType(Integer priorityType) {
        this.priorityType = priorityType;
    }

    public String getConditionSql() {
        return conditionSql;
    }

    public void setConditionSql(String conditionSql) {
        this.conditionSql = conditionSql;
    }
}
