package com.solt.jdc;

import com.solt.jdc.service.EmployeeService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan
public class RunnerMain {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(RunnerMain.class);
        context.registerShutdownHook();

        EmployeeService employeeService = context.getBean(EmployeeService.class);
        try {
            employeeService.saveEmployeesWithoutTransaction();
        }catch (Exception e){
            System.out.println("Exception during saving employees: " + e.getMessage());
        }
        employeeService.printEmployees();
        employeeService.deleteAllEmployees();

        try {
            employeeService.saveEmployeesWithTransaction();
        }catch (Exception e){
            System.out.println("Exception during saving employees: " + e.getMessage());
        }
        employeeService.printEmployees();
        employeeService.deleteAllEmployees();

    }
}
