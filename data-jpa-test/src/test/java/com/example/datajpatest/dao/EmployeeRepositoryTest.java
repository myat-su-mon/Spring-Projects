package com.example.datajpatest.dao;

import com.example.datajpatest.entity.Employee;
import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Arrays;
import java.util.List;

@RunWith(SpringRunner.class)
@DataJpaTest
public class EmployeeRepositoryTest {

    private static final Employee EMPLOYEE_1 = new Employee(1, "John", "Doe", "john@gmail.com");
    private static final Employee EMPLOYEE_2 = new Employee(2, "Dave", "Doe", "dave@gmail.com");
    @Autowired
    private EmployeeRepository employeeRepository;
    @Autowired
    private TestEntityManager testEntityManager;

    @Test
    public void shouldStoreEmployees(){
//        employeeRepository.saveAll(List.of(EMPLOYEE_1, EMPLOYEE_2));
        testEntityManager.merge(EMPLOYEE_1);
        testEntityManager.merge(EMPLOYEE_2);
//        employeeRepository.save(EMPLOYEE_1);
//        employeeRepository.save(EMPLOYEE_2);
        Assert.assertEquals(EMPLOYEE_1, testEntityManager.find(Employee.class, 1));
        Assert.assertEquals(EMPLOYEE_2, testEntityManager.find(Employee.class, 2));
    }

    @Test
    public void shouldFindEmployeesByEmail(){
        testEntityManager.merge(EMPLOYEE_1);
        testEntityManager.merge(EMPLOYEE_2);
        Assert.assertEquals(EMPLOYEE_1, employeeRepository.findByEmail(EMPLOYEE_1.getEmail()));
        Assert.assertEquals(EMPLOYEE_2, employeeRepository.findByEmail(EMPLOYEE_2.getEmail()));
    }
}
