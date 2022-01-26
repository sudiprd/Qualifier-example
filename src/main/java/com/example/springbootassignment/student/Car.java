package com.example.springbootassignment.student;


import org.springframework.stereotype.Component;

@Component("car")
public class Car implements Vehicle {

    @Override
    public void price() {
        System.out.println("Car price is 800000.00");
    }

    @Override
    public void model() {
        System.out.println("Car model is SUV");
    }

    @Override
    public boolean drivingLicense(boolean license) {
        if(license != true) {
            System.out.println("Person is not license holder :");
        }else
        {
            System.out.println("License holder");
        }
        return false;
    }
}
