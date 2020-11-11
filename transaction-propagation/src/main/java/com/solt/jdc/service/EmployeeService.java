package com.solt.jdc.service;

import com.solt.jdc.dao.EmployeeDao;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class EmployeeService {
    private final EmployeeDao employeeDao;

    public EmployeeService(EmployeeDao employeeDao) {
        this.employeeDao = employeeDao;
    }

    public void callRequiredWithoutCurrentTransaction(){
        employeeDao.requiredTransactionMethod();
    }

    @Transactional
    public void callRequiredWithCurrentTransaction(){
        employeeDao.requiredTransactionMethod();
    }

    public void callSupportWithoutCurrentTransaction(){
        employeeDao.supportsTransactionMethod();
    }

    @Transactional
    public void callSupportWithCurrentTransaction(){
        employeeDao.supportsTransactionMethod();
    }

    public void callMandatoryWithoutCurrentTransaction(){
        employeeDao.mandatoryTransactionMethod();
    }

    @Transactional
    public void callMandatoryWithCurrentTransaction(){
        employeeDao.mandatoryTransactionMethod();
    }

    public void callRequiredNewWithoutCurrentTransaction(){
        employeeDao.requiredNewTransactionMethod();
    }

    @Transactional
    public void callRequiredNewWithCurrentTransaction(){
        employeeDao.requiredNewTransactionMethod();
    }

    public void callNotSupportedWithoutCurrentTransaction(){
        employeeDao.notSupportedTransactionMethod();
    }

    @Transactional
    public void callNotSupportedWithCurrentTransaction(){
        employeeDao.notSupportedTransactionMethod();
    }

    public void callNeverWithoutCurrentTransaction(){
        employeeDao.neverTransactionMethod();
    }

    @Transactional
    public void callNeverWithCurrentTransaction(){
        employeeDao.neverTransactionMethod();
    }

    public void callNestedWithoutCurrentTransaction(){
        employeeDao.nestedTransactionMethod();
    }

    @Transactional
    public void callNestedWithCurrentTransaction(){
        employeeDao.nestedTransactionMethod();
    }

}
