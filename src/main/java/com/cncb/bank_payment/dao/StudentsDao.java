package com.cncb.bank_payment.dao;

import com.cncb.bank_payment.entity.InputParameter;
import com.cncb.bank_payment.entity.Students;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

/**
 * @author HEE
 * @date 2019/12/10
 * @description
 */
@Mapper
@Component(value = "StudentsDao")
public interface StudentsDao {

    /**
     * @author: shenww
     * @description: 查询学生信息，返回学生ID
     * @param: [parameter]
     * @date: 2019/12/11
     * @return: java.lang.String
     */
    Students findStudent(InputParameter parameter);

}
