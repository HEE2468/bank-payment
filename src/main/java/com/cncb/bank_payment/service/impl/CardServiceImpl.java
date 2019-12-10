package com.cncb.bank_payment.service.impl;

import com.cncb.bank_payment.dao.CardDao;
import com.cncb.bank_payment.service.CardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author HEE
 * @date 2019/12/10
 * @description
 */
@Service
public class CardServiceImpl implements CardService {

    @Autowired
    private CardDao cardDao;
}
