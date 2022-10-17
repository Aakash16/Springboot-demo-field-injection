package com.demo.fieldinjection;

import org.springframework.context.annotation.Configuration;

@Configuration
public class Toyota implements Car {

    private String Name = "Toyota";

    @Override
    public String getManufacturerName() {
        return Name;
    }
}
