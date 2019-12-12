package com.cncb.bank_payment.dao;

import com.cncb.bank_payment.entity.Card;
import com.cncb.bank_payment.entity.CheckRecord;
import com.cncb.bank_payment.entity.PayfeeInfo;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;

/**
 * @author HEE
 * @date 2019/12/10
 * @description
 */
@Mapper
@Component(value = "PayfeeInfoDao")
public interface PayfeeInfoDao {
    List<Map<String, Object>> getPayfeeFromStudentId(String studentId);

    void addCheckRecord(CheckRecord checkRecord);

    List<Card> getCard(String accountId);

    Card getCardFromId(String cardNo);

    void updateM(Float card_m, String card_id);

    Float getMFromId(String payfee_id);

    void addRecord(CheckRecord checkRecord);
}
