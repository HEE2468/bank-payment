package com.cncb.bank_payment.entity;

import java.util.List;

/**
 * @author HEE
 * @date 2019/12/11
 * @description
 */
public class SchoolCategoryDTO  {
    // 学校类别
    private String schoolCategory;
    // 学校名称
    private List<SchoolDTO> schoolNames;

    public String getSchoolCategory() {
        return schoolCategory;
    }

    public void setSchoolCategory(String schoolCategory) {
        this.schoolCategory = schoolCategory;
    }

    public List<SchoolDTO> getSchoolNames() {
        return schoolNames;
    }

    public void setSchoolNames(List<SchoolDTO> schoolNames) {
        this.schoolNames = schoolNames;
    }
}
