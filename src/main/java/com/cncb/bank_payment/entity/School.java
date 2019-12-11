package com.cncb.bank_payment.entity;

/**
 * @author HEE
 * @date 2019/12/10
 * @description
 */
public class School {

    // 学校类别
    private String school_class_id;
    // 学校代号
    private String school_id;
    private String sql_id;
    private String school_name;
    private String dep_id;
    private String dep_name;
    private Float tuition;
    private Float accomodation;

    public String getSchool_class_id() {
        return school_class_id;
    }

    public void setSchool_class_id(String school_class_id) {
        this.school_class_id = school_class_id;
    }

    public String getSchool_id() {
        return school_id;
    }

    public void setSchool_id(String school_id) {
        this.school_id = school_id;
    }

    public String getSql_id() {
        return sql_id;
    }

    public void setSql_id(String sql_id) {
        this.sql_id = sql_id;
    }

    public String getSchool_name() {
        return school_name;
    }

    public void setSchool_name(String school_name) {
        this.school_name = school_name;
    }

    public String getDep_id() {
        return dep_id;
    }

    public void setDep_id(String dep_id) {
        this.dep_id = dep_id;
    }

    public String getDep_name() {
        return dep_name;
    }

    public void setDep_name(String dep_name) {
        this.dep_name = dep_name;
    }

    public Float getTuition() {
        return tuition;
    }

    public void setTuition(Float tuition) {
        this.tuition = tuition;
    }

    public Float getAccomodation() {
        return accomodation;
    }

    public void setAccomodation(Float accomodation) {
        this.accomodation = accomodation;
    }
}
