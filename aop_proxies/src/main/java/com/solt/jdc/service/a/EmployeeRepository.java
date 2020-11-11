package com.solt.jdc.service.a;

import com.solt.jdc.ds.Employee;

public interface EmployeeRepository {
    Employee findEmployeeById(long id);
    void saveEmployee(Employee employee);
    void deleteEmployee(Employee employee);
    void findAndUpdateEmployeeId(long id, Employee employeeToMerge);
    void deleteByEmail(String email);
}
