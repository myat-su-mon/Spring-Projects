package com.example.datajpatest.entity;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@DataJpaTest
public class EmployeeTest {

    private static final Employee EMPLOYEE_1 = new Employee(1, "John", "Doe", "john@gmail.com");
    private static final Employee EMPLOYEE_2 = new Employee(2, "Dave", "Doe", "dave@gmail.com");

    @Autowired
    private TestEntityManager testEntityManager;

    @Test
    public void shouldStoreEmployeeAndFindById(){
        testEntityManager.merge(EMPLOYEE_1);
        testEntityManager.merge(EMPLOYEE_2);
        Assert.assertEquals(EMPLOYEE_1, testEntityManager.find(Employee.class, 1));
        Assert.assertEquals(EMPLOYEE_2, testEntityManager.find(Employee.class, 2));
    }
}
