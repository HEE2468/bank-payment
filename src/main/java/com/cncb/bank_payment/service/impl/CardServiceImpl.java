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
    public int insertCard(Card card) {
        card.setCard_id(EntityIDFactory.createId());
        // 默认剩余余额有10万元
        card.setCard_m(10000000000f);
        int cardNum = cardDao.insertCard(card);
        if(cardNum !=0) {
            return 1;
        }else{
            return 0;
        }
    }
}
