package com.cncb.bank_payment.service;

import com.cncb.bank_payment.entity.Loan;
import com.cncb.bank_payment.entity.PayfeeInfo;

/**
 * @author dailiwen
 * @date 2019/12/10
 */
public interface LoanService {
    Loan getLoan(String payfeeId);

    String applicateUpload(Loan loan);

    String applicateDelete(String id);

    PayfeeInfo getPayfeeFromId(String payfeeId);
}
