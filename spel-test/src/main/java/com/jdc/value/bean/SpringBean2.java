package com.jdc.value.bean;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

//@Component
public class SpringBean2 {
    @Value("3")
    private int taxId;
    @Value("#{${app.tax.value}/100.0}")
    private float taxValue;
    @Value("${app.tax.department.name}")
    private String taxDepartmentName;
    @Value("${app.tax.department.alt.name:no_name}")
    private String taxDepartmentAlternativeName;

    public int getTaxId() {
        return taxId;
    }

    public void setTaxId(int taxId) {
        this.taxId = taxId;
    }

    public float getTaxValue() {
        return taxValue;
    }

    public void setTaxValue(float taxValue) {
        this.taxValue = taxValue;
    }

    public String getTaxDepartmentName() {
        return taxDepartmentName;
    }

    public void setTaxDepartmentName(String taxDepartmentName) {
        this.taxDepartmentName = taxDepartmentName;
    }

    public String getTaxDepartmentAlternativeName() {
        return this.taxDepartmentAlternativeName;
    }

    public void setTaxDepartmentAlternativeName(String taxDepartmentAlternativeName) {
        this.taxDepartmentAlternativeName = taxDepartmentAlternativeName;
    }

}
