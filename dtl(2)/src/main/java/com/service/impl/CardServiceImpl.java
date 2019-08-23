package com.service.impl;

import com.bean.Card;
import com.mapper.CardMapper;
import com.service.CardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service("CardService")
public class CardServiceImpl implements CardService {

    @Autowired
    CardMapper cardMapper;

    public List<Card> getCard(Card card){
        return cardMapper.getCard(card);
    }

}
