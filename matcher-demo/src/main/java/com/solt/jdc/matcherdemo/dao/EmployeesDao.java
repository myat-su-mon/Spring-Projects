package com.solt.jdc.matcherdemo.dao;


import com.solt.jdc.matcherdemo.ds.Employee;
import org.springframework.data.repository.CrudRepository;

public interface EmployeesDao extends CrudRepository<Employee, Integer> {
}
