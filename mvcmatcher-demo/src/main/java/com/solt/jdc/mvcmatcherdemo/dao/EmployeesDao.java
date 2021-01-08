package com.solt.jdc.mvcmatcherdemo.dao;


import com.solt.jdc.mvcmatcherdemo.ds.Employee;
import org.springframework.data.repository.CrudRepository;

public interface EmployeesDao extends CrudRepository<Employee, Integer> {
}
