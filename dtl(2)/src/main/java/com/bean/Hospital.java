package com.bean;



import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

@Data
@Entity
@Table(name = "t_hospital")
public class Hospital implements Serializable {

    @Id
    @Column(name = "hospital_id")
    private Long hospitalId;
    @Column(name = "hospital_name")
    private String hospitalName;
    @Column(name = "area")
    private String area;
    @Column(name = "address")
    private String address;
    @Column(name = "level")
    private String level;
    @Column(name = "department")
    private String department;
    @Column(name = "img_url")
    private String imgUrl;
    @Column(name = "phone")
    private String phone;
    @Column(name = "classify")
    private String classify;
    @Column(name = "url")
    private String url;
    @Column(name = "route")
    private String route;
}