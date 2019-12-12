package com.cncb.bank_payment.service;

import com.cncb.bank_payment.entity.Card;

/**
 * @author HEE
 * @date 2019/12/10
 * @description
 */
public interface CardService {
    String isExistCard(String card_no, String idenity, String card_tel, String card_name, String card_password);

    String bindCard(String user_id, String card_id);
}
