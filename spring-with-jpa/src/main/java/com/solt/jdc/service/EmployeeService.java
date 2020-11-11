package com.solt.jdc.service;

import com.solt.jdc.dao.EmployeeDao;
import com.solt.jdc.ds.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.Date;

@Service
public class EmployeeService {

    @Autowired
    private EmployeeDao employeeDao;

    public void saveAllEmployees(){
        System.out.println("Saving all employees....................");
        employeeDao.save(new Employee(1, "John", "Doe", "john.com", "123456", Date.valueOf("2019-06-05"), 50000));
        employeeDao.save(new Employee(2, "William", "Doe", "john.com", "123456", Date.valueOf("2019-06-05"), 50000));
        employeeDao.save(new Employee(3, "Jay", "Doe", "john.com", "123456", Date.valueOf("2019-06-05"), 50000));
        employeeDao.save(new Employee(4, "Morgan", "Doe", "john.com", "123456", Date.valueOf("2019-06-05"), 50000));
        employeeDao.save(new Employee(5, "Freeman", "Doe", "john.com", "123456", Date.valueOf("2019-06-05"), 50000));
        System.out.println("Saved all employees....................");
    }

    public void listAllEmployees(){
        System.out.println("Listing all employee.............");
        employeeDao.findAll().forEach(System.out::println);
    }
}
