package com.cncb.bank_payment.service.impl;

import com.cncb.bank_payment.dao.AccountDao;
import com.cncb.bank_payment.dao.UserDao;
import com.cncb.bank_payment.entity.Account;
import com.cncb.bank_payment.entity.User;
import com.cncb.bank_payment.service.AccountService;
import com.cncb.bank_payment.utils.EntityIDFactory;
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

    @Autowired
    private UserDao userDao;

    @Override
    public int insertAccount(User user) {
        String id = EntityIDFactory.createId();
        user.setUser_id(id);
        int accountNum = userDao.insertUser(user);
        Account account = new Account();
        account.setAccount_id(id);
        account.setUser_id(id);
        account.setAccount_tel(user.getUser_tel());
        account.setIdenity(user.getIdenity());
        account.setAccount_password(user.getUser_paw());
        int userNum = accountDao.insertAccount(account);
        if(accountNum != 0 && userNum != 0){
            return 1;
        }else{
            return 0;
        }
    }
}
