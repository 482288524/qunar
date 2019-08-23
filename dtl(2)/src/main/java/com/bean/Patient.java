package com.bean;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.util.Date;

@Data
@Entity
@Table(name = "t_patient")
public class Patient implements Serializable {

    @Id
    @Column(name = "patient_id")
    private Long patientId;
    @Column(name = "interval_plan_id")
    private Integer intervalPlanId;
    @Column(name = "doctor_name")
    private String doctorName;
    @Column(name = "real_name")
    private String realName;
    @Column(name = "sex")
    private String sex;
    @Column(name = "id_card_no")
    private String idCardNo;
    @Column(name = "card_type")
    private String cardType;
    @Column(name = "card_no")
    private String cardNo;
    @Column(name = "priority")
    private String priority;
    @Column(name = "phone_number")
    private String phoneNumber;
    @Column(name = "hos_name")
    private String hosName;
    @Column(name = "time")
    private String time;
    @Column(name = "dep_name")
    private String depName;
    @Column(name = "status")
    private String status;


    public Long getPatientId() {
        return patientId;
    }

    public void setPatientId(Long patientId) {
        this.patientId = patientId;
    }

    public Integer getIntervalPlanId() {
        return intervalPlanId;
    }

    public void setIntervalPlanId(Integer intervalPlanId) {
        this.intervalPlanId = intervalPlanId;
    }

    public String getDoctorName() {
        return doctorName;
    }

    public void setDoctorName(String doctorName) {
        this.doctorName = doctorName;
    }

    public String getRealName() {
        return realName;
    }

    public void setRealName(String realName) {
        this.realName = realName;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getIdCardNo() {
        return idCardNo;
    }

    public void setIdCardNo(String idCardNo) {
        this.idCardNo = idCardNo;
    }

    public String getCardType() {
        return cardType;
    }

    public void setCardType(String cardType) {
        this.cardType = cardType;
    }

    public String getCardNo() {
        return cardNo;
    }

    public void setCardNo(String cardNo) {
        this.cardNo = cardNo;
    }

    public String getPriority() {
        return priority;
    }

    public void setPriority(String priority) {
        this.priority = priority;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

}
