package com.adi.main;

import com.adi.beans.Vehicle;
import com.adi.config.ProjectConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Example1 {

    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(ProjectConfig.class);

        Vehicle vehicle = context.getBean("vehicle1", Vehicle.class);

        System.out.println(vehicle.getName());
    }
}
