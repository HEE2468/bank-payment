package com.cncb.bank_payment.entity;

/**
 * @author HEE
 * @date 2019/12/10
 * @description
 */
public class Account {
    private String account_id;
    private String account_tel;
    private String account_password;
    private String user_id;
    private String idenity;

    public String getAccount_id() {
        return account_id;
    }

    public void setAccount_id(String account_id) {
        this.account_id = account_id;
    }

    public String getAccount_tel() {
        return account_tel;
    }

    public void setAccount_tel(String account_tel) {
        this.account_tel = account_tel;
    }

    public String getAccount_password() {
        return account_password;
    }

    public void setAccount_password(String account_password) {
        this.account_password = account_password;
    }

    public String getUser_id() {
        return user_id;
    }

    public void setUser_id(String user_id) {
        this.user_id = user_id;
    }

    public String getIdenity() {
        return idenity;
    }

    public void setIdenity(String idenity) {
        this.idenity = idenity;
    }
}
