package com.solt.jdc.service;

import com.solt.jdc.dao.custom.CustomEmployeeDao;
import com.solt.jdc.dao.regular.EmployeeDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService {
    @Autowired
    private EmployeeDao employeeDao;
    @Autowired
    private CustomEmployeeDao customEmployeeDao;

    public void queryEmployee(){
        System.out.println("Search for John Doe with Simple Jpa implementation........");
        System.out.println(
                employeeDao.findByFirstNameAndLastName("John", "Doe")
        );
        System.out.println("Search for John Doe with Custom Jpa implementation...");
        System.out.println(
                customEmployeeDao.findByFirstNameAndLastName("John","Doe")
        );
    }
}
