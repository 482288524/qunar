package com.bean;



import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

@Data
@Entity
@Table(name = "t_consultation_room")
public class ConsultationRoomInfo implements Serializable {

    @Id
    @Column(name = "consultation_id")
    private Integer consultationId;
    @Column(name = "department_id")
    private String departmentId;
    @Column(name = "consultation_name")
    private String consultationName;
    @Column(name = "consultation_type")
    private Integer consultationType;

}