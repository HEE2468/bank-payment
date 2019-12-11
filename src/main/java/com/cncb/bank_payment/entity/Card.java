package com.cncb.bank_payment.entity;

/**
 * @author HEE
 * @date 2019/12/10
 * @description
 */
public class Card {
    private String card_id;
    private String card_tel;
    private String card_no;
    private String card_name;
    private String idenity;
    private Float card_m;
    private String card_passward;
    private String user_id;

    public String getCard_id() {
        return card_id;
    }

    public void setCard_id(String card_id) {
        this.card_id = card_id;
    }

    public String getCard_tel() {
        return card_tel;
    }

    public void setCard_tel(String card_tel) {
        this.card_tel = card_tel;
    }

    public String getCard_no() {
        return card_no;
    }

    public void setCard_no(String card_no) {
        this.card_no = card_no;
    }

    public String getCard_name() {
        return card_name;
    }

    public void setCard_name(String card_name) {
        this.card_name = card_name;
    }

    public String getIdenity() {
        return idenity;
    }

    public void setIdenity(String idenity) {
        this.idenity = idenity;
    }

    public Float getCard_m() {
        return card_m;
    }

    public void setCard_m(Float card_m) {
        this.card_m = card_m;
    }

    public String getCard_passward() {
        return card_passward;
    }

    public void setCard_passward(String card_passward) {
        this.card_passward = card_passward;
    }

    public String getUser_id() {
        return user_id;
    }

    public void setUser_id(String user_id) {
        this.user_id = user_id;
    }
}
