package com.cncb.bank_payment.service.impl;

import com.cncb.bank_payment.dao.AccountDao;
import com.cncb.bank_payment.dao.UserDao;
import com.cncb.bank_payment.entity.Account;
import com.cncb.bank_payment.entity.User;
import com.cncb.bank_payment.service.AccountService;
import com.cncb.bank_payment.utils.EntityIDFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Random;

/**
 * @author HEE
 * @date 2019/12/10
 * @description
 */
@Service
public class AccountServiceImpl implements AccountService {

    @Autowired
    private AccountDao accountDao;

    @Autowired
    private UserDao userDao;

    @Override
    public int insertAccount(Account account) {
        String user_id = EntityIDFactory.createId()+Math.random();
        String account_id = EntityIDFactory.createId();
        account.setAccount_id(account_id);
        account.setUser_id(user_id);
        int accountNum = accountDao.insertAccount(account);
        User user = new User();
        user.setUser_id(user_id);
        user.setUser_tel(account.getAccount_tel());
        user.setUser_name(account.getAccount_tel());
        user.setIdentity(account.getIdentity());
        user.setUser_paw(account.getAccount_password());
        int userNum = userDao.insertUser(user);
        if(accountNum != 0 && userNum != 0){
            return 1;
        }else{
            return 0;
        }
    }
}
