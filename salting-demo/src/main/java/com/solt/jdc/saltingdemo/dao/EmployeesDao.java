package com.solt.jdc.saltingdemo.dao;


import com.solt.jdc.saltingdemo.ds.Employee;
import org.springframework.data.repository.CrudRepository;

public interface EmployeesDao extends CrudRepository<Employee, Integer> {
}
