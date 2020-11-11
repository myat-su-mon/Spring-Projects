package com.solt.jdc.service.a;

import com.solt.jdc.ds.Employee;
import org.springframework.stereotype.Component;

@Component
public class EmployeeRepositoryImpl implements EmployeeRepository{

    @Override
    public Employee findEmployeeById(long id) {
        return new Employee();
    }

    @Override
    public void saveEmployee(Employee employee) {

    }

    @Override
    public void deleteEmployee(Employee employee) {

    }

    @Override
    public void findAndUpdateEmployeeId(long id, Employee employeeToMerge) {
        Employee employeeId = findEmployeeById(id);
        saveEmployee(employeeId);
    }

    public void deleteByEmail(String email){

    }

}
