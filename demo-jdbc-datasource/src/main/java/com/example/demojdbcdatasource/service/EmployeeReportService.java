package com.example.demojdbcdatasource.service;

import com.example.demojdbcdatasource.dao.EmployeeDao;
import org.springframework.stereotype.Service;

@Service
public class EmployeeReportService {

    private final EmployeeDao employeeDao;

    public EmployeeReportService(EmployeeDao employeeDao){
        this.employeeDao = employeeDao;
    }

    public void printReport(){
        System.out.println("Employee Report Start.");
        employeeDao.findEmployeeEmails().forEach(System.out::println);
        System.out.println("Employee Report End.");
    }
}
