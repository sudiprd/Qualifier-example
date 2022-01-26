package com.example.springbootassignment.student;


import org.springframework.stereotype.Component;

@Component("bike")
public class Bike implements Vehicle{


    @Override
    public void price() {
        System.out.println("Bike vehicle price method called");
    }

    @Override
    public void model() {
        System.out.println("Bike model is Honda");
    }

    @Override
    public boolean drivingLicense(boolean license) {
        if(license != true) {
            System.out.println("Person is not license holder:");
        }else
            {
                System.out.println("License holder");
            }
        return false;
    }
}
