package com.cncb.bank_payment.controller;

import com.cncb.bank_payment.entity.Card;
import com.cncb.bank_payment.entity.PayfeeInfo;
import com.cncb.bank_payment.service.PayfeeInfoService;
import com.cncb.bank_payment.utils.JacksonUtil;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collections;
import java.util.Enumeration;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpSession;

/**
 * @author HEE
 * @date 2019/12/10
 * @description
 */
@RestController
@RequestMapping("/payfee")
public class PayfeeInfoController {

    @Autowired
    private PayfeeInfoService payfeeInfoService;

    @RequestMapping(value = "getPayfee", method = RequestMethod.GET)
    public String getPayfee(String studentId) {
        List<Map<String, Object>> payfeeInfo = payfeeInfoService.getPayfee(studentId);
        return JacksonUtil.objectToJson(payfeeInfo);
    }

    @RequestMapping(value = "getCard", method = RequestMethod.GET)
    public String getCard(HttpSession httpSession) {
        List<Card> cards = payfeeInfoService.getCard((String) httpSession.getAttribute("userId"));
        if (cards == null || cards.size() == 0) {
            return "FAIL";
        } else {
            return JacksonUtil.objectToJson(cards);
        }
    }

    @RequestMapping(value = "payment", method = RequestMethod.POST)
    public String payment(Float payfee, String payfeeIds, String cardIds, String cardPassword, HttpSession httpSession) {
        return payfeeInfoService.payment(payfee, payfeeIds, cardIds, cardPassword, (String) httpSession.getAttribute("userId"));
    }
}
