package com.bean;



import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.util.Date;

@Data
@Entity
@Table(name = "t_arrangement_info")
public class ArrangementInfo implements Serializable {

    @Id
    @Column(name = "arrangement_id")
    private Integer arrangementId;
    @Column(name = "consultation_id")
    private Integer consultationId;
    @Column(name = "doctor_id")
    private Integer doctorId;
    @Column(name = "arrangement_dt")
    private String arrangementDt;
    @Column(name = "bgn_tm")
    private String bgnTm;
    @Column(name = "end_tm")
    private String endTm;
    @Column(name = "zjpb")
    private Integer zjpb;
    @Column(name = "ghje")
    private String ghje;
    @Column(name = "ghlb")
    private Integer ghlb;

}