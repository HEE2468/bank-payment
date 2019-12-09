package com.cncb.bank_payment.dao;

import com.cncb.bank_payment.entity.User;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author HEE
 * @date 2019/12/9
 * @description
 */
@Mapper
public interface UserDao {

    User login(User user);

    User findPassword(String name);
}
