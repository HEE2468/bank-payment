package com.cncb.bank_payment.entity;

/**
 * @author HEE
 * @date 2019/12/10
 * @description
 */
public class PayfeeInfo {

    private String payfee_id;
    private String user_id;
    private String payfee;
    private String payfee_date;

    public String getPayfee_id() {
        return payfee_id;
    }

    public void setPayfee_id(String payfee_id) {
        this.payfee_id = payfee_id;
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

    public String getPayfee_date() {
        return payfee_date;
    }

    public void setPayfee_date(String payfee_date) {
        this.payfee_date = payfee_date;
    }
}
