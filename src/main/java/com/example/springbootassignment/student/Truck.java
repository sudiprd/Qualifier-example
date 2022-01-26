package com.example.springbootassignment.student;

import org.springframework.stereotype.Component;

@Component("truck")
public class Truck implements Vehicle{

    @Override
    public void price() {
        System.out.println("Truck rate is 90 lakh");

    }
    @Override
    public void model() {
        System.out.println("Truck model is Tripper");
    }

    @Override
    public boolean drivingLicense(boolean license) {
        return false;
    }

//    @Override
//    public boolean drivingLicense(boolean license) {
//        if(license != true) {
//            System.out.println("Person is not license holder :");
//        }else
//        {
//            System.out.println("License holder");
//        }
//        return false;
//    }

    public void age(int age){
        if( age > 30){
            System.out.println("Can hold Driving Holder");
        }
        else {
            System.out.println("Wait until person is abobve 30 years Old");
        }
    }

}

