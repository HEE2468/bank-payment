package com.cncb.bank_payment.controller;

import com.cncb.bank_payment.service.PayfeeInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
}
