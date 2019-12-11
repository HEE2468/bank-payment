package com.cncb.bank_payment.service.impl;

import com.cncb.bank_payment.dao.LoanDao;
import com.cncb.bank_payment.entity.Loan;
import com.cncb.bank_payment.entity.PayfeeInfo;
import com.cncb.bank_payment.service.LoanService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author dailiwen
 * @date 2019/12/10
 */
@Service
public class LoanServiceImpl implements LoanService {
    @Autowired
    LoanDao loanDao;

    @Override
    public Loan getLoan(String payfeeId) {
        Loan loan = loanDao.getLoanFromPayfeeId(payfeeId);
        return loan;
    }

    @Override
    public String applicateUpload(Loan loan) {
        try {
            loanDao.addLoan(loan);
            return "SUCCESS";
        } catch (Exception e) {
            System.out.println(e);
            return "FAIL";
        }
    }

    @Override
    public String applicateDelete(String id) {
        try {
            loanDao.applicateDelete(id);
            return "SUCCESS";
        } catch (Exception e) {
            System.out.println(e);
            return "FAIL";
        }
    }

    @Override
    public PayfeeInfo getPayfeeFromId(String payfeeId) {
        return loanDao.getPayfeeFromid(payfeeId);
    }
}
