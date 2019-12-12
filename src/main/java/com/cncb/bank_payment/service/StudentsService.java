package com.cncb.bank_payment.service;

import com.cncb.bank_payment.entity.InputParameter;

/**
 * @author HEE
 * @date 2019/12/10
 * @description
 */
public interface StudentsService {

    /**
     * @author: shenww
     * @description: 查询学生信息
     * @param: [parameter]
     * @date: 2019/12/11
     * @return: java.lang.String
     */
    String findStudent(String stdname, String stdnum, String schoolname);
}
