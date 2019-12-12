package com.cncb.bank_payment.service.impl;

import com.cncb.bank_payment.dao.PayfeeInfoDao;
import com.cncb.bank_payment.entity.Card;
import com.cncb.bank_payment.entity.CheckRecord;
import com.cncb.bank_payment.entity.PayfeeInfo;
import com.cncb.bank_payment.service.PayfeeInfoService;
import com.cncb.bank_payment.utils.EntityIDFactory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author HEE
 * @date 2019/12/10
 * @description
 */
@Service
public class PayfeeInfoServiceImpl implements PayfeeInfoService {

    @Autowired
    private PayfeeInfoDao payfeeInfoDao;


    @Override
    public List<Map<String, Object>> getPayfee(String studentId) {
        List<Map<String, Object>> temp = payfeeInfoDao.getPayfeeFromStudentId(studentId);
        List<Map<String, Object>> result = new ArrayList<>();
        Map<Object, Object> map = new HashMap<>();
        for (int i = 0; i < temp.size(); i++) {
            if(!map.containsKey(temp.get(i).get("payfee_id"))) {
                map.put(temp.get(i).get("payfee_id"), temp.get(i).get("payfee_date"));
                result.add(temp.get(i));
            }
        }
        return result;
    }

    @Override
    public List<Card> getCard(String accountId) {
        return payfeeInfoDao.getCard(accountId);
    }

    @Override
    public String getCardFromId(Float money, String cardNo, String cardPassword) {
        Card card = payfeeInfoDao.getCardFromId(cardNo);
        if (card.getCard_password().equals(cardPassword)) {
            if (money > card.getCard_m()) {

            }
        }
        return null;
    }

    @Override
    public String payment(Float payfee, String payfeeIds, String cardIds, String cardPassword, String accountId) {
        Card card = payfeeInfoDao.getCardFromId(cardIds);
        if (!card.getCard_password().equals(cardPassword)) {
            return "0";
        } else {
            if (payfee > card.getCard_m()) return "1";
            else {
                payfeeInfoDao.updateM(sub(card.getCard_m(), payfee), cardIds);
                String[] payfeeIDs = payfeeIds.split(",");
                for (int i = 0; i < payfeeIDs.length; i++) {
                    Float payfeeM = payfeeInfoDao.getMFromId(payfeeIDs[i]);
                    String id = EntityIDFactory.createId();
                    CheckRecord checkRecord = new CheckRecord(id, new Timestamp(new Date().getTime()), cardIds, id, accountId, payfeeIDs[i], payfeeM, "success");
                    payfeeInfoDao.addCheckRecord(checkRecord);
                }
                return "2";
            }
        }
    }

    public static float sub(float v1, float v2) {
        BigDecimal b1 = new BigDecimal(Float.toString(v1));
        BigDecimal b2 = new BigDecimal(Float.toString(v2));
        return b1.subtract(b2).floatValue();

    }
}
