package com.solt.jdc.springstartertest.ds;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@Data
@Builder
@AllArgsConstructor
public class City {

    @Id
    @GeneratedValue
    private Integer id;
    private String name;

    public City(){

    }
}
