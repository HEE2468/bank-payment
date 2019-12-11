package com.cncb.bank_payment.controller;

import com.cncb.bank_payment.entity.Account;
import com.cncb.bank_payment.entity.User;
import com.cncb.bank_payment.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author HEE
 * @date 2019/12/10
 * @description
 */
@RestController
@RequestMapping("/account")
@EnableTransactionManagement
public class AccountController {

    @Autowired
    private AccountService accountService;

    @RequestMapping("/insertAccount")
    @Transactional(rollbackFor = {Exception.class})
    public String insertAccount(@RequestBody User user){
        if(accountService.insertAccount(user)==0){
            return "failure";
        }else{
            return "successful";
        }
    }

}
