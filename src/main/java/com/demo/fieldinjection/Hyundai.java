package com.demo.fieldinjection;

import org.springframework.context.annotation.Configuration;

@Configuration
public class Hyundai implements Car{

    private String Name = "Hyundai";

    @Override
    public String getManufacturerName() {
        return Name;
    }
}
