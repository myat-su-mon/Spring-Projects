package com.example.springbootdemo.ds;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;

@Data
@Entity
@Table
public class TodoItem {

    @Id
    @GeneratedValue
    private Integer id;
    @NotBlank(message = "Task title is required.")
    private String title;
}
