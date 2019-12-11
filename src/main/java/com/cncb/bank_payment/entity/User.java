package com.cncb.bank_payment.entity;

/**
 * @author HEE
 * @date 2019/12/9
 * @description
 */
public class User {

    private String user_id;
    private String user_tel;
    private String user_name;
    private String idenity;
    private String user_paw;

    public User(String user_tel, String user_paw) {
        this.user_tel = user_tel;
        this.user_paw = user_paw;
    }

    public String getUser_id() {
        return user_id;
    }

    public void setUser_id(String user_id) {
        this.user_id = user_id;
    }

    public String getUser_tel() {
        return user_tel;
    }

    public void setUser_tel(String user_tel) {
        this.user_tel = user_tel;
    }

    public String getUser_name() {
        return user_name;
    }

    public void setUser_name(String user_name) {
        this.user_name = user_name;
    }

    public String getIdenity() {
        return idenity;
    }

    public void setIdenity(String idenity) {
        this.idenity = idenity;
    }

    public String getUser_paw() {
        return user_paw;
    }

    public void setUser_paw(String user_paw) {
        this.user_paw = user_paw;
    }
}
