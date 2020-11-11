package com.example.springbootdemo.dao;

import com.example.springbootdemo.ds.TodoItem;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TodoItemDao extends CrudRepository<TodoItem, Integer> {
}
