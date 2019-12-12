package com.cncb.bank_payment.controller;

import com.cncb.bank_payment.entity.Loan;
import com.cncb.bank_payment.entity.PayfeeInfo;
import com.cncb.bank_payment.service.LoanService;
import com.cncb.bank_payment.utils.EntityIDFactory;
import com.cncb.bank_payment.utils.JacksonUtil;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.sql.Timestamp;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpSession;

/**
 * @author HEE
 * @date 2019/12/9
 * @description
 */
@RestController
@RequestMapping("/loan")
public class LoanController {

    @Autowired
    LoanService loanService;

    @RequestMapping(value = "getLoan", method = RequestMethod.GET)
    public String getLoan(String payfee_id) {
        Map<String, Object> loan = loanService.getLoan(payfee_id);
        List<Map<String, Object>> result = new ArrayList<>();
        result.add(loan);
        return JacksonUtil.objectToJson(result);
    }

    @RequestMapping(value = "loanUpload", method = RequestMethod.POST)
    public String upload(String payfee_id, String studentSno, HttpSession httpSession, Float loanAmount, MultipartFile file) {
        String id = EntityIDFactory.createId();

        if (file.isEmpty()) {
            // "上传失败，请选择文件";
            return JacksonUtil.objectToJson("FAIL");
        }
        String fileName = file.getOriginalFilename();  // 文件名
        String filePath = "D://LoanApplicate//"; // 上传后的路径
        fileName = id + "-" + fileName; // 新文件名
        Loan loan = new Loan(id, studentSno, (String) httpSession.getAttribute("userId"), filePath + fileName, new Timestamp(new Date().getTime()), loanAmount, "学费", 1, payfee_id);
        String result = loanService.applicateUpload(loan);
        if ("SUCCESS".equals(result)) {
            File localFile = new File(filePath + fileName);
            if (!localFile.getParentFile().exists()) {
                localFile.getParentFile().mkdirs();
            }
            try {
                file.transferTo(localFile);
                return JacksonUtil.objectToJson("SUCCESS");
            } catch (IOException e) {
                System.out.println("上传失败 - " + e);
                loanService.applicateDelete(id);
                return JacksonUtil.objectToJson("FAIL");
            }
        } else {
            return JacksonUtil.objectToJson("FAIL");
        }
    }

    @RequestMapping(value = "getPayfeeFromId", method = RequestMethod.GET)
    public String getPayfeeFromId(String payfeeId) {
        PayfeeInfo payfeeInfo = loanService.getPayfeeFromId(payfeeId);
        return JacksonUtil.objectToJson(payfeeInfo);
    }

}
