package com.cncb.bank_payment.entity;

/**
 * @author HEE
 * @date 2019/12/11
 * @description
 */
public class InputParameter {

    // 学校名称
    private String school_name;
    // 学院名称
    private String dep_name;
    // 学生姓名
    private String student_name;

    public String getSchool_name() {
        return school_name;
    }

    public void setSchool_name(String school_name) {
        this.school_name = school_name;
    }

    public String getDep_name() {
        return dep_name;
    }

    public void setDep_name(String dep_name) {
        this.dep_name = dep_name;
    }

    public String getStudent_name() {
        return student_name;
    }

    public void setStudent_name(String student_name) {
        this.student_name = student_name;
    }
}
