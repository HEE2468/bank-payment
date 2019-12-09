package com.cncb.bank_payment.entity;

import com.cncb.bank_payment.utils.EntityIDFactory;

/**
 * @author HEE
 * @date 2019/12/9
 * @description
 */
public class User {

   private String id;
   private String name;
   private String password;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = EntityIDFactory.createId();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
