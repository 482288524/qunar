package com.controller;

import com.alibaba.fastjson.JSONObject;
import com.bean.Card;
import com.mapper.CardMapper;
import com.service.CardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
public class CardController {

    @Autowired
    CardService cardService;
    @Autowired
    CardMapper cardMapper;

    @RequestMapping("/selectCard")
    @ResponseBody
    public JSONObject selectCard(Card card) {
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("cardList", cardService.getCard(card));
        return jsonObject;
    }

    @RequestMapping("/insertCard")
    @ResponseBody
    public JSONObject insertCard(Card card) {
        JSONObject jsonObject = new JSONObject();
        Integer result = cardMapper.insert(card);
        if (result > 0 ) {
            jsonObject.put("info", "插入成功");
        } else {
            jsonObject.put("info", "插入失败");
        }
        return jsonObject;
    }

    @RequestMapping("/deleteCard")
    @ResponseBody
    public JSONObject deleteCard(Card card) {
        JSONObject jsonObject = new JSONObject();
        Integer result = cardMapper.delete(card);
        if (result > 0 ) {
            jsonObject.put("info", "删除成功");
        } else {
            jsonObject.put("info", "删除失败");
        }
        return jsonObject;
    }

    @RequestMapping("/updateCard")
    @ResponseBody
    public JSONObject updateCard(Card card) {
        JSONObject jsonObject = new JSONObject();
        Integer result = cardMapper.updateByPrimaryKeySelective(card);
        if (result > 0 ) {
            jsonObject.put("info", "更新成功");
        } else {
            jsonObject.put("info", "更新失败");
        }
        return jsonObject;
    }

}
