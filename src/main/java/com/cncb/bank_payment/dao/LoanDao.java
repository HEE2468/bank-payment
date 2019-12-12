package com.cncb.bank_payment.dao;

import com.cncb.bank_payment.entity.Loan;
import com.cncb.bank_payment.entity.PayfeeInfo;

import org.apache.ibatis.annotations.Mapper;

import java.util.Map;

/**
 * 贷款申请dao层
 *
 * @author dailiwen
 * @date 2019/12/10
 */
@Mapper
public interface LoanDao {
    Map<String, Object> getLoanFromPayfeeId(String payfeeId);

    PayfeeInfo getPayfeeFromid(String payfeeId);

    void addLoan(Loan loan);

    void applicateDelete(String id);
}
