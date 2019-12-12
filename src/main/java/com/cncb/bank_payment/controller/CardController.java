package com.cncb.bank_payment.controller;

import com.cncb.bank_payment.entity.Card;
import com.cncb.bank_payment.service.CardService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;

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

    @RequestMapping("/addCard")
    public String insertCard(String cardnum, String cernum, String phonenum, String cardname, String password, HttpSession httpSession) {
        String cardId = cardService.isExistCard(cardnum, cernum, phonenum, cardname, password);
        if (cardId == null) {
            return "FAIL";
        } else {

            return "SUCCESS";
        }
    }
}
