package com.solt.jdc.service;

import com.solt.jdc.dao.EmployeeDao;
import com.solt.jdc.ds.Employee;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.sql.Date;

@Service
public class EmployeeService {
    private final EmployeeDao employeeDao;

    public EmployeeService(EmployeeDao employeeDao) {
        this.employeeDao = employeeDao;
    }

    public void printEmployees(){
        System.out.println("Printing all employees.");
        employeeDao.findAllEmployee().forEach(System.out::println);
    }

    public void deleteAllEmployees(){
        System.out.println("Deleting all employees.");
        employeeDao.deleteAllEmployee();
    }

    public void saveEmployeesWithoutTransaction(){
        System.out.println("Saving employees without transaction.....");
        saveEmployee();
    }

    @Transactional
    public void saveEmployeesWithTransaction(){
        System.out.println("Saving employees with transaction.....");
        saveEmployee();
    }

    public void saveEmployee(){
        employeeDao.saveEmployee(new Employee(1, "John", "Doe", "johndoe@gmail.com", "555-555-88", Date.valueOf("2019-06-05"),70000F));
        employeeDao.saveEmployee(new Employee(2, "William", "Doe", "johndoe@gmail.com", "555-555-88", Date.valueOf("2019-06-05"),80000F));
        employeeDao.saveEmployee(new Employee(3, "Jenny", "Doe", "johndoe@gmail.com", "555-555-88", Date.valueOf("2019-06-05"),90000F));
        employeeDao.saveEmployee(new Employee(-1, "Haunting", "Doe", "johndoe@gmail.com", "555-555-88", Date.valueOf("2019-06-05"),60000F));
        employeeDao.saveEmployee(new Employee(5, "Thomas", "Doe", "johndoe@gmail.com", "555-555-88", Date.valueOf("2019-06-05"),50000F));
    }
}
