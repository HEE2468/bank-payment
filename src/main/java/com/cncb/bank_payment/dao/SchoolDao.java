package com.cncb.bank_payment.dao;

import com.cncb.bank_payment.entity.SchoolCategoryDTO;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @author HEE
 * @date 2019/12/10
 * @description
 */
@Mapper
@Component(value = "SchoolDao")
public interface SchoolDao {

    List<SchoolCategoryDTO> findStudentInfo();

}
