package com.bean;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.util.Date;

@Data
@Entity
@Table(name = "t_sys_set")
public class SysSet implements Serializable {

    @Id
    @Column(name = "set_id")
    private Integer setId;
    @Column(name = "check_max_day_num")
    private Integer checkMaxDayNum;
    @Column(name = "gh_if_msg_push")
    private Byte ghIfMsgPush;
    @Column(name = "msg_num")
    private Integer msgNum;
    @Column(name = "server_ip")
    private String serverIp;
    @Column(name = "holidays")
    private String holidays;
    @Column(name = "register_max_day_num")
    private Integer registerMaxDayNum;

}
