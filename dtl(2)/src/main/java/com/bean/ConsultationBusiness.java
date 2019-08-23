package com.bean;



import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

@Data
@Entity
@Table(name = "t_consultation_business")
public class ConsultationBusiness implements Serializable {

    @Id
    @Column(name = "cb_id")
    private Integer cbId;
    @Column(name = "business_id")
    private String businessId;
    @Column(name = "consultation_id")
    private Integer consultationId;
}