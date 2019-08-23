package com.bean;



import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

@Data
@Entity
@Table(name = "t_card")
public class Card implements Serializable {

    @Id
    @Column(name = "card_id")
    private Integer cardId;
    @Column(name = "card_type")
    private Integer cardType;
    @Column(name = "card_name")
    private String cardName;
}