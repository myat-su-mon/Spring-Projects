package com.example.demo.controller;

import com.example.demo.dao.DepartmentDao;
import com.example.demo.ds.Department;
import com.example.demo.security.annotation.department.IsDepartmentCreate;
import com.example.demo.security.annotation.department.IsDepartmentDelete;
import com.example.demo.security.annotation.department.IsDepartmentRead;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.validation.Valid;

@Controller
public class DepartmentController {

    @Autowired
    private DepartmentDao departmentDao;

    @IsDepartmentRead
    @GetMapping("/departments")
    public ModelAndView index(){
        return new ModelAndView("departments", "departments", departmentDao.findAll());
    }

    @IsDepartmentCreate
    @GetMapping("/departments/create")
    public ModelAndView create(){
        return new ModelAndView("department-crate", "department", new Department());
    }

    @IsDepartmentCreate
    @PostMapping("/departments/create")
    public String create(@ModelAttribute @Valid Department department, BindingResult bindingResult){
        if (bindingResult.hasErrors()){
            return "department-create";
        } else {
            return "redirect:/departments";
        }
    }

    @IsDepartmentDelete
    @GetMapping("/departments/delete/{id}")
    public String delete(@PathVariable Integer id){
        departmentDao.deleteById(id);
        return "redirect:/departments";
    }
}
