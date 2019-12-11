package com.cncb.bank_payment.controller;

import com.cncb.bank_payment.entity.Card;
import com.cncb.bank_payment.service.CardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author HEE
 * @date 2019/12/10
 * @description
 */
@RestController
@RequestMapping("/card")
public class CardController {

    @Autowired
    private CardService cardService;

    @RequestMapping("/insertCard")
    public String insertCard(@RequestBody Card card){
        if(cardService.insertCard(card)==0){
            return "failure";
        }else{
            return "successful";
        }
    }
}
