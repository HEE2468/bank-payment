package com.cncb.bank_payment.service.impl;

import com.cncb.bank_payment.dao.PayfeeInfoDao;
import com.cncb.bank_payment.entity.CheckRecord;
import com.cncb.bank_payment.entity.PayfeeInfo;
import com.cncb.bank_payment.service.PayfeeInfoService;
import com.cncb.bank_payment.utils.EntityIDFactory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.Timestamp;
import java.util.Date;
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
        return payfeeInfoDao.getPayfeeFromStudentId(studentId);
    }

    @Override
    public String addCheckRecord(String card_id, String bank_flow, String user_id, Float payfee) {
        String check_id = EntityIDFactory.createId();
        CheckRecord checkRecord = new CheckRecord(check_id, new Timestamp(new Date().getTime()), card_id, bank_flow, user_id, payfee, "success");
        try {
            payfeeInfoDao.addCheckRecord(checkRecord);
            return "SUCCESS";
        } catch (Exception e) {
            System.out.println(e);
            return "FAIL";
        }
    }
}
