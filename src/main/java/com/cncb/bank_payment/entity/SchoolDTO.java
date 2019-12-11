package com.cncb.bank_payment.entity;

import java.util.List;

/**
 * @author HEE
 * @date 2019/12/11
 * @description
 */
public class SchoolDTO {

    private String schoolName;
    private List<DepDTO> academys;

    public String getSchoolName() {
        return schoolName;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }

    public List<DepDTO> getAcademys() {
        return academys;
    }

    public void setAcademys(List<DepDTO> academys) {
        this.academys = academys;
    }
}
