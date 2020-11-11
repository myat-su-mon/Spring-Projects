package com.solt.jdc.dao.custom;

import com.solt.jdc.ds.Employee;
import org.springframework.data.repository.CrudRepository;

public interface CustomEmployeeDao extends CrudRepository<Employee, Integer>, CustomEmployeeFindRepository{
}
