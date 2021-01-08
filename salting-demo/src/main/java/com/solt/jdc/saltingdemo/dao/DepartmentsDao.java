package com.solt.jdc.saltingdemo.dao;


import com.solt.jdc.saltingdemo.ds.Department;
import org.springframework.data.repository.CrudRepository;

public interface DepartmentsDao extends CrudRepository<Department, Integer> {
}
