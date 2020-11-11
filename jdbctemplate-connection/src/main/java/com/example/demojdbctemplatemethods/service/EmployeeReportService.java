package com.example.demojdbctemplatemethods.service;

import com.example.demojdbctemplatemethods.dao.EmployeeDao;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class EmployeeReportService {

    private final EmployeeDao employeeDao;

    public EmployeeReportService(EmployeeDao employeeDao){
        this.employeeDao = employeeDao;
    }

    public void printReport(){
        System.out.println("Employee Report Start");

        System.out.println("findEmployeesCount: "+ employeeDao.findEmployeesCount());
        System.out.println("findEmployeesCount: "+ employeeDao.findEmployeesCount());
        System.out.println("findEmployeesCount: "+ employeeDao.findEmployeesCount());
        System.out.println("findEmployeesCount: "+ employeeDao.findEmployeesCount());
        System.out.println("findEmployeesCount: "+ employeeDao.findEmployeesCount());

        System.out.println("Employee Report Stop");
    }

    @Transactional
    public void printReportInTransaction(){
        System.out.println("Employee Report Start - Transactional");

        System.out.println("findEmployeesCount: "+ employeeDao.findEmployeesCount());
        System.out.println("findEmployeesCount: "+ employeeDao.findEmployeesCount());
        System.out.println("findEmployeesCount: "+ employeeDao.findEmployeesCount());
        System.out.println("findEmployeesCount: "+ employeeDao.findEmployeesCount());
        System.out.println("findEmployeesCount: "+ employeeDao.findEmployeesCount());

        System.out.println("Employee Report End - Transactional");
    }
}
