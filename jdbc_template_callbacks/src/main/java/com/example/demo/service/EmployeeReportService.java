package com.example.demo.service;

import com.example.demo.dao.EmployeeDao;
import org.springframework.stereotype.Service;

@Service
public class EmployeeReportService {
    private final EmployeeDao employeeDao;

    public EmployeeReportService(EmployeeDao employeeDao){
        this.employeeDao = employeeDao;
    }

    public void printReport(){
        System.out.println("Employee Report Start.");
        System.out.println("Employee Lists");
        //employeeDao.findEmployees().forEach(System.out::println);

        System.out.println("Employees Average Salary Calculated Row by Row");
        //System.out.println(employeeDao.findAverageSalaryByRow());

        System.out.println("Employee Average Salary Calculated on Entire Result Set");
        System.out.println(employeeDao.findAverageSalaryCalculatedOnEntireResultSet());

        System.out.println("Employee Average Salary with Streams");
        System.out.println(employeeDao.findAverageSalaryModernImplementation());

        System.out.println("Employee Average Salary with Sql Level");
        System.out.println(employeeDao.findAverageSalarySqlLevel());

        System.out.println("Employee found based on email");
        System.out.println(employeeDao.findEmployeeIdFromEmail("jayvongrant@gmail.com"));
        System.out.println("Employee Report End.");
    }
}
