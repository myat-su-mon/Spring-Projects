package com.solt.jdc.matcherdemo.controller;

import com.solt.jdc.matcherdemo.dao.CustomersDao;
import com.solt.jdc.matcherdemo.ds.Customer;
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
public class CustomersController {

    @Autowired
    private CustomersDao customersDao;

    @GetMapping("/customers")
    public ModelAndView index() {
        return new ModelAndView("customers", "customers", customersDao.findAll());
    }

    @GetMapping("/customers/view/{customerId}")
    public ModelAndView view(@PathVariable int customerId) {
        return new ModelAndView("customer-view", "customer", customersDao.findById(customerId));
    }

    @GetMapping("/customers/create")
    public ModelAndView create() {
        return new ModelAndView("customer-create", "customer", new Customer());
    }

    @PostMapping("/customers/create")
    public String create(@ModelAttribute @Valid Customer customer, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            return "customer-create";
        } else {
            customersDao.save(customer);

            return "redirect:/customers";
        }
    }

    @GetMapping("/customers/delete/{id}")
    public String delete(@PathVariable Integer id) {
        customersDao.deleteById(id);

        return "redirect:/customers";
    }
}
