package com.solt.jdc.service.b;

import com.solt.jdc.ds.Employee;
import org.springframework.stereotype.Component;

@Component
public class AlternativeEmployeeRepository {

    public Employee findEmployeeById(long id){
        return new Employee();
    }

    public void saveEmployee(Employee employee){}

    public void deleteEmployee(Employee employee){}

    public void findAndUpdateEmployeeById(long id, Employee employeeToMerge){
        Employee employeeById = findEmployeeById(5);
        saveEmployee(employeeById);
    }
}
