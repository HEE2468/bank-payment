package com.cncb.bank_payment.dao;

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
}
