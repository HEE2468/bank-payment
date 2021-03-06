package com.cncb.bank_payment.controller;

import com.cncb.bank_payment.entity.SchoolCategoryDTO;
import com.cncb.bank_payment.service.SchoolService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author HEE
 * @date 2019/12/10
 * @description
 */
@RestController
@RequestMapping("/school")
public class SchoolController {

    @Autowired
    private SchoolService schoolService;

    @RequestMapping("/findStudentInfo")
    public List<SchoolCategoryDTO> findStudentInfo(){
        return schoolService.findStudentInfo();
    }
}
