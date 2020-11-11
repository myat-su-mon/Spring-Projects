package com.example.demojdbctemplatemethods.service;

import com.example.demojdbctemplatemethods.dao.EmployeeDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeReportService {

    private final EmployeeDao employeeDao;

    public EmployeeReportService(EmployeeDao employeeDao){
        this.employeeDao = employeeDao;
    }

    public void printReport(){
        System.out.println("Employee Report Start");
        System.out.println("find Employees");
        employeeDao.findEmployees().forEach(System.out::println);

        System.out.println("findEmployeeEmails()");
        employeeDao.findEmployeeEmails().forEach(System.out::println);

        System.out.println("findEmployeeWithHighSalary()");
        System.out.println(employeeDao.findEmployeeWithHighSalary());

        System.out.println("findEmployeeById()");
        System.out.println(employeeDao.findEmployeeById(3));

        System.out.println("findEmployeeThatWasHiredLast()");
        System.out.println(employeeDao.findEmployeeThatWasHiredLast());

        System.out.println("findEmployeeEmailsAndPhones()");
        System.out.println(employeeDao.findEmployeeEmailsAndPhones());

        System.out.println("insertNewDummyRecord()");
        employeeDao.insertNewDummyRecord();

        System.out.println("updateDummyRecord()");
        System.out.println("Result from update: " + employeeDao.updateDummyRecord(99, "Mike"));
        System.out.println("Employee Report End");
    }
}
