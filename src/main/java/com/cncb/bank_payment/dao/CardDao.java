package com.cncb.bank_payment.dao;

import com.cncb.bank_payment.entity.Card;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

/**
 * @author HEE
 * @date 2019/12/10
 * @description
 */
@Mapper
@Component(value = "CardDao")
public interface CardDao {

    String isExistCard(String card_no, String idenity, String card_tel, String card_name, String card_password);

    void bindCard(String user_id, String card_id);
}
