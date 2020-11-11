package com.solt.jdc;

import com.solt.jdc.ds.Employee;
import com.solt.jdc.service.a.EmployeeRepository;
import com.solt.jdc.service.b.AlternativeEmployeeRepository;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class RunnerMain {
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        context.registerShutdownHook();

        EmployeeRepository employeeRepository = context.getBean(EmployeeRepository.class);
        AlternativeEmployeeRepository alternativeEmployeeRepository = context.getBean(AlternativeEmployeeRepository.class);
        SamePackageEmployeeRepository samePackageEmployeeRepository = context.getBean(SamePackageEmployeeRepository.class);

//        Employee employee = employeeRepository.findEmployeeById(5);
//        employeeRepository.saveEmployee(employee);
//        employeeRepository.deleteEmployee(new Employee());
//        employeeRepository.findAndUpdateEmployeeId(4, new Employee());

//        Method deleteByEmail = employeeRepository.getClass().getDeclaredMethod("deleteByEmail", String.class);
//        deleteByEmail.setAccessible(true);
//        deleteByEmail.invoke(employeeRepository, "john@gmail.com");

//        alternativeEmployeeRepository.findEmployeeById(5L);
//        alternativeEmployeeRepository.saveEmployee(new Employee());
//        alternativeEmployeeRepository.deleteEmployee(new Employee());
//        alternativeEmployeeRepository.findAndUpdateEmployeeById(5L, new Employee());

        samePackageEmployeeRepository.deleteEmployeeByEmail("john@gmail.com");
        samePackageEmployeeRepository.deleteEmployee(5L);
        samePackageEmployeeRepository.saveEmployee(new Employee());

//        Method deleteEmployeeByPhone = samePackageEmployeeRepository.getClass()
//                .getSuperclass().getDeclaredMethod("deleteEmployeeByPhone", String.class);
//        deleteEmployeeByPhone.setAccessible(true);
//        deleteEmployeeByPhone.invoke(samePackageEmployeeRepository, "09123456789");
    }
}
