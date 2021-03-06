package com.cncb.bank_payment.dao;

import com.cncb.bank_payment.entity.Account;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

/**
 * @author HEE
 * @date 2019/12/10
 * @description
 */
@Mapper
@Component(value = "AccountDao")
public interface AccountDao {
    
    int insertAccount(Account account);

}
