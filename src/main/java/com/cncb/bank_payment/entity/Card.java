package com.cncb.bank_payment.entity;

/**
 * @author HEE
 * @date 2019/12/10
 * @description
 */
public class Card {
    private String card_id;
    private String account_num;
    private String account_tel;
    private String user_id;
    private String account_passward;

    private Float card_m;

    public String getCard_id() {
        return card_id;
    }

    public void setCard_id(String card_id) {
        this.card_id = card_id;
    }

    public String getAccount_num() {
        return account_num;
    }

    public void setAccount_num(String account_num) {
        this.account_num = account_num;
    }

    public String getAccount_tel() {
        return account_tel;
    }

    public void setAccount_tel(String account_tel) {
        this.account_tel = account_tel;
    }

    public String getUser_id() {
        return user_id;
    }

    public void setUser_id(String user_id) {
        this.user_id = user_id;
    }

    public String getAccount_passward() {
        return account_passward;
    }

    public void setAccount_passward(String account_passward) {
        this.account_passward = account_passward;
    }

    public Float getCard_m() {
        return card_m;
    }

    public void setCard_m(Float card_m) {
        this.card_m = card_m;
    }
}
