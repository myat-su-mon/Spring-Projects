package com.solt.jdc.db.products.ds;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.Id;

@AllArgsConstructor
@Getter
@Setter
@ToString
@Entity
public class Product {
    @Id
    private int id;
    private String name;
    private int quantity;
    private float price;
    private boolean available;

    public Product() {
    }
}
