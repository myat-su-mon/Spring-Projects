package com.solt.jdc.springstartertest.ds;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Cities {

    private Iterable<City> cities;

    public Cities(){

    }
}
