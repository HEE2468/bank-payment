package com.cncb.bank_payment.entity;

import java.util.Date;

/**
 * @author HEE
 * @date 2019/12/10
 * @description
 */
public class CheckRecord {

    private String check_id;
    private Date record_date;
    private String card_id;
    private String bank_flow;
    private String user_id;
    private String payfee;
    private String check_status;

    public String getCheck_id() {
        return check_id;
    }

    public void setCheck_id(String check_id) {
        this.check_id = check_id;
    }

    public Date getRecord_date() {
        return record_date;
    }

    public void setRecord_date(Date record_date) {
        this.record_date = record_date;
    }

    public String getCard_id() {
        return card_id;
    }

    public void setCard_id(String card_id) {
        this.card_id = card_id;
    }

    public String getBank_flow() {
        return bank_flow;
    }

    public void setBank_flow(String bank_flow) {
        this.bank_flow = bank_flow;
    }

    public String getUser_id() {
        return user_id;
    }

    public void setUser_id(String user_id) {
        this.user_id = user_id;
    }

    public String getPayfee() {
        return payfee;
    }

    public void setPayfee(String payfee) {
        this.payfee = payfee;
    }

    public String getCheck_status() {
        return check_status;
    }

    public void setCheck_status(String check_status) {
        this.check_status = check_status;
    }
}
