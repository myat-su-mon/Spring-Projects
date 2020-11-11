package com.example.springbootdemo.web;

import com.example.springbootdemo.dao.TodoItemDao;
import com.example.springbootdemo.ds.TodoItem;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import javax.validation.Valid;

@Controller
public class TodoController {

    @Autowired
    private TodoItemDao todoItemDao;

    @GetMapping("/")
    public String index(TodoItem todoItem, Model model){
        model.addAttribute("todoItems", todoItemDao.findAll());
        model.addAttribute("todoItem", todoItem);
        return "index";
    }

    @PostMapping("/add")
    public String add(@Valid @ModelAttribute TodoItem todoItem, BindingResult result, Model model){
        if (result.hasErrors()){
            return index(todoItem,model);
        }
        todoItemDao.save(todoItem);
        return "redirect:/";
    }
}
