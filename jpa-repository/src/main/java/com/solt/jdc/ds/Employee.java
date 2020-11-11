package com.solt.jdc.ds;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.sql.Date;

@AllArgsConstructor
@Entity
@Getter
@Setter
@ToString
public class Employee {
    @Id
    private int id;
    private String firstname;
    private String lastname;
    private String email;
    private String phoneNumber;
    private Date hireDate;
    private float salary;

    public Employee() {
    }
}
