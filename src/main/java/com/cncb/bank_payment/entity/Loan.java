package com.cncb.bank_payment.entity;

import java.sql.Timestamp;

/**
 * 贷款申请类
 * 对应数据库loan表
 * @author dailiwen
 * @date 2019/12/10
 */
public class Loan {

    private String id;
    private String studentSno;
    private String accountId;
    private String applicateFile;
    private Timestamp applicateTime;
    private Float loanAmount;
    private String loanName;
    private Integer status;

    public Loan() {
    }

    public Loan(String id, String studentSno, String accountId, String applicateFile, Timestamp applicateTime, Float loanAmount, String loanName, Integer status) {
        this.id = id;
        this.studentSno = studentSno;
        this.accountId = accountId;
        this.applicateFile = applicateFile;
        this.applicateTime = applicateTime;
        this.loanAmount = loanAmount;
        this.loanName = loanName;
        this.status = status;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getStudentSno() {
        return studentSno;
    }

    public void setStudentSno(String studentSno) {
        this.studentSno = studentSno;
    }

    public String getAccountId() {
        return accountId;
    }

    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }

    public String getApplicateFile() {
        return applicateFile;
    }

    public void setApplicateFile(String applicateFile) {
        this.applicateFile = applicateFile;
    }

    public Timestamp getApplicateTime() {
        return applicateTime;
    }

    public void setApplicateTime(Timestamp applicateTime) {
        this.applicateTime = applicateTime;
    }

    public Float getLoanAmount() {
        return loanAmount;
    }

    public void setLoanAmount(Float loanAmount) {
        this.loanAmount = loanAmount;
    }

    public String getLoanName() {
        return loanName;
    }

    public void setLoanName(String loanName) {
        this.loanName = loanName;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }
}
