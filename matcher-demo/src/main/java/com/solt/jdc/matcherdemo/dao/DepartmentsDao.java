package com.solt.jdc.matcherdemo.dao;


import com.solt.jdc.matcherdemo.ds.Department;
import org.springframework.data.repository.CrudRepository;

public interface DepartmentsDao extends CrudRepository<Department, Integer> {
}
