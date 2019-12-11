package com.cncb.bank_payment.service;

import com.cncb.bank_payment.entity.SchoolCategoryDTO;

import java.util.List;

/**
 * @author HEE
 * @date 2019/12/10
 * @description
 */
public interface SchoolService {

    List<SchoolCategoryDTO> findStudentInfo();

}
