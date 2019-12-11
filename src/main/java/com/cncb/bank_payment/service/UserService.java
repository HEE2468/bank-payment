package com.cncb.bank_payment.service;

import com.cncb.bank_payment.entity.User;

/**
 * @author HEE
 * @date 2019/12/9
 * @description
 */
public interface UserService {

    User login(String userTel, String userPaw);
}
