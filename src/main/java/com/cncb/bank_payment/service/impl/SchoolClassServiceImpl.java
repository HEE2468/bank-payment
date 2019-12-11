package com.cncb.bank_payment.service.impl;

import com.cncb.bank_payment.dao.SchoolClassDao;
import com.cncb.bank_payment.service.SchoolClassService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author HEE
 * @date 2019/12/10
 * @description
 */
@Service
public class SchoolClassServiceImpl implements SchoolClassService {

    @Autowired
    private SchoolClassDao schoolClassDao;
}
