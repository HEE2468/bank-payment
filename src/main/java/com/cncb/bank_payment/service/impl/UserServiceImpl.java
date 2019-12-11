package com.cncb.bank_payment.service.impl;

import com.cncb.bank_payment.dao.UserDao;
import com.cncb.bank_payment.entity.User;
import com.cncb.bank_payment.service.UserService;
import com.cncb.bank_payment.utils.MD5Util;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author HEE
 * @date 2019/12/9
 * @description
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    @Override
    public User login(String userTel, String userPaw) {
        // 密码
        User user = new User(userTel, userPaw);
        String password = user.getUser_paw();
        String md5Before = MD5Util.getMD5_32(password);
        User userCheck = userDao.findPassword(user.getUser_tel());
        if (userCheck == null) {
            return null;
        }
        String md5After = userCheck.getUser_paw();
        if (md5After.equals(md5Before)) {
            return userCheck;
        } else {
            return null;
        }
    }
}
