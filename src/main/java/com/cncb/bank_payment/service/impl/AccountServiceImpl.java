package com.cncb.bank_payment.service.impl;

import com.cncb.bank_payment.dao.AccountDao;
import com.cncb.bank_payment.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author HEE
 * @date 2019/12/10
 * @description
 */
@Service
public class AccountServiceImpl implements AccountService {

    @Autowired
    private AccountDao accountDao;
}
