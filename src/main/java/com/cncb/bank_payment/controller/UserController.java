package com.cncb.bank_payment.controller;

import com.cncb.bank_payment.entity.User;
import com.cncb.bank_payment.service.UserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author HEE
 * @date 2019/12/9
 * @description
 */
@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    UserService userService;

    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public String login(User user) {
        if (userService.login(user) == null) {
            return "ERROR";
        } else {
            return "OK";
        }
    }

}
