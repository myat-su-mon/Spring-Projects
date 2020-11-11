package com.solt.jdc.dao.custom;

import com.solt.jdc.ds.Employee;

public interface CustomEmployeeFindRepository {

    Employee findByFirstNameAndLastName(String firstName, String lastName);

}
