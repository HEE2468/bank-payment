package com.cncb.bank_payment.service.impl;

import com.cncb.bank_payment.dao.CardDao;
import com.cncb.bank_payment.entity.Card;
import com.cncb.bank_payment.service.CardService;
import com.cncb.bank_payment.utils.EntityIDFactory;

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


    @Override
    public String isExistCard(String card_no, String idenity, String card_tel, String card_name, String card_password) {
        return cardDao.isExistCard(card_no, idenity, card_tel, card_name, card_password);
    }

    @Override
    public String bindCard(String user_id, String card_id) {
        try {
            cardDao.bindCard(user_id, card_id);
            return "SUCCESS";
        } catch (Exception e) {
            return "FAIL";
        }
    }
}
