package com.solt.jdc.annotationcontrollermethod.ds;

import lombok.Data;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;

@Data
public class Country {

    @NotBlank(message = "Country name can not be empty")
    @Pattern(regexp = "[A-Za-z]*", message = "Country name contains illegal characters")
    private String country;

}
