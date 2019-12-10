package com.cncb.bank_payment.service.impl;

import com.cncb.bank_payment.dao.SchoolDao;
import com.cncb.bank_payment.service.SchoolService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author HEE
 * @date 2019/12/10
 * @description
 */
@Service
public class SchoolServiceImpl implements SchoolService {

    @Autowired
    private SchoolDao schoolDao;
}
