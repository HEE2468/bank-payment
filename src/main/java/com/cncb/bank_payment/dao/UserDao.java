package com.cncb.bank_payment.dao;

import com.cncb.bank_payment.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

/**
 * @author HEE
 * @date 2019/12/9
 * @description
 */
@Mapper
@Component(value = "UserDao")
public interface UserDao {

    User findPassword(String name);

    int insertUser(User user);

}
