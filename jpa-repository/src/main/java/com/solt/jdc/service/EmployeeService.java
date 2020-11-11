package com.solt.jdc.service;

import com.solt.jdc.dao.EmployeeDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.Date;

@Service
public class EmployeeService {

    @Autowired
    private EmployeeDao employeeDao;

    public void queryEmployee(){
        System.out.println("top 3 employees by salary.");
        employeeDao.findTop3ByOrderBySalaryDesc().forEach(System.out::println);
        System.out.println("Searching for John Doe employee....");
        System.out.println(employeeDao.searchFirstNameAndLastName("John", "Doe"));
        System.out.println("Employees hired between 12 july 2019 and 19 july 2019");
        employeeDao.findByHireDateBetween(Date.valueOf("2019-07-12"), Date.valueOf("2019-07-19"));
        System.out.println("Employees order by hire date desc");
        employeeDao.findByOrderByHireDateDesc().forEach(System.out::println);
    }
}
