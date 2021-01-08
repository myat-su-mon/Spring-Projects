package com.example.springrestdemo2hateoas.ds;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Entity
@Getter
@Setter
@AllArgsConstructor
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String code;
    private String firstName;
    private String lastName;

    @OneToMany(mappedBy = "customer",cascade =CascadeType.ALL,fetch = FetchType.EAGER)
    private List<Address> addresses;

    public Customer(){

    }


    @Override
    public String toString() {
        return "Customer{" +
                "id=" + id +
                ", code='" + code + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }
}
