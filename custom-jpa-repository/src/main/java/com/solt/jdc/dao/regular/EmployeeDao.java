package com.solt.jdc.dao.regular;

import com.solt.jdc.ds.Employee;
import org.springframework.data.repository.CrudRepository;

public interface EmployeeDao extends CrudRepository<Employee, Integer> {
    Employee findByFirstNameAndLastName(String firstName, String lastName);
}
