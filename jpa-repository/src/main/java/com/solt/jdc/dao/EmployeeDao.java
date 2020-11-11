package com.solt.jdc.dao;

import com.solt.jdc.ds.Employee;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.sql.Date;
import java.util.List;

public interface EmployeeDao extends CrudRepository<Employee, Integer> {
    Employee findByFirstnameAndLastname(String firstname, String lastname);

    List<Employee> findTop3ByOrderBySalaryDesc();

    List<Employee> findByHireDateBetween(Date min, Date max);

    List<Employee> findByOrderByHireDateDesc();

    @Query("select e from Employee e where e.firstname =?1 and e.lastname = ?2")
    Employee searchFirstNameAndLastName(String firstName, String lastName);

}
