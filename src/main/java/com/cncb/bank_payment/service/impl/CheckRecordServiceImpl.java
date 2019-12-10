package com.cncb.bank_payment.service.impl;

import com.cncb.bank_payment.dao.CheckRecordDao;
import com.cncb.bank_payment.service.CheckRecordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author HEE
 * @date 2019/12/10
 * @description
 */
@Service
public class CheckRecordServiceImpl implements CheckRecordService {

    @Autowired
    private CheckRecordDao checkRecordDao;
}
