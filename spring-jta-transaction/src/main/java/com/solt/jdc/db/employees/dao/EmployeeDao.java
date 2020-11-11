package com.solt.jdc.db.employees.dao;

import com.solt.jdc.db.employees.ds.Employee;
import org.springframework.data.repository.CrudRepository;

public interface EmployeeDao extends CrudRepository<Employee, Integer> {
}
