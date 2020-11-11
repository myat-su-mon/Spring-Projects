package com.solt.jdc;

import com.solt.jdc.service.EmployeeService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@ComponentScan
@EnableAspectJAutoProxy
public class RunnerMain {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(RunnerMain.class);
        context.registerShutdownHook();

        EmployeeService employeeService = context.getBean(EmployeeService.class);

        employeeService.callRequiredWithoutCurrentTransaction();
        employeeService.callRequiredWithCurrentTransaction();
        employeeService.callSupportWithoutCurrentTransaction();
        employeeService.callSupportWithCurrentTransaction();
        employeeService.callMandatoryWithoutCurrentTransaction();
        employeeService.callMandatoryWithCurrentTransaction();
        employeeService.callRequiredNewWithoutCurrentTransaction();
        employeeService.callRequiredNewWithCurrentTransaction();
        employeeService.callNotSupportedWithCurrentTransaction();
        employeeService.callNotSupportedWithoutCurrentTransaction();
        employeeService.callNeverWithCurrentTransaction();
        employeeService.callNeverWithoutCurrentTransaction();
        employeeService.callNestedWithCurrentTransaction();
        employeeService.callNestedWithoutCurrentTransaction();
    }

}
