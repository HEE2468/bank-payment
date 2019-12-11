package com.cncb.bank_payment.service;

import com.cncb.bank_payment.entity.CheckRecord;
import com.cncb.bank_payment.entity.PayfeeInfo;

import java.util.List;
import java.util.Map;

/**
 * @author HEE
 * @date 2019/12/10
 * @description
 */
public interface PayfeeInfoService {

    List<Map<String, Object>> getPayfee(String studentId);

    String addCheckRecord(String card_id, String bank_flow, String user_id, Float payfee);
}
