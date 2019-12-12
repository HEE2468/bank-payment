package com.cncb.bank_payment.service;

import com.cncb.bank_payment.entity.Loan;
import com.cncb.bank_payment.entity.PayfeeInfo;

import java.util.Map;

/**
 * @author dailiwen
 * @date 2019/12/10
 */
public interface LoanService {
    Map<String, Object> getLoan(String payfeeId);

    String applicateUpload(Loan loan);

    String applicateDelete(String id);

    PayfeeInfo getPayfeeFromId(String payfeeId);
}
