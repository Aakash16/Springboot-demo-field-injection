package com.demo.fieldinjection;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class FieldInjectionDemo {

    public static void main(String[] args)
    {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(CarConfig.class);
        Car car = context.getBean("hyundai", Car.class);
        System.out.println("This manufacturer is: " + car.getManufacturerName());
    }
}
