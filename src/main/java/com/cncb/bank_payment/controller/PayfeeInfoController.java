package com.cncb.bank_payment.controller;

import com.cncb.bank_payment.entity.PayfeeInfo;
import com.cncb.bank_payment.service.PayfeeInfoService;
import com.cncb.bank_payment.utils.JacksonUtil;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.Enumeration;
import java.util.List;
import java.util.Map;

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

    @RequestMapping(value = "addCheckRecord", method = RequestMethod.POST)
    public String addCheckRecord(String card_id, String bank_flow, String user_id, Float payfee) {
        return payfeeInfoService.addCheckRecord(card_id, bank_flow, user_id, payfee);
    }
}
