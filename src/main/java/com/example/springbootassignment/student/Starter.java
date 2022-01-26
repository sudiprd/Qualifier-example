package com.example.springbootassignment.student;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class Starter implements CommandLineRunner {

    //constructor base DI

//    private Vehicle car;
//    private Vehicle bike;
//    private Vehicle truck;
//
//    @Autowired
//    public Starter(@Qualifier ("car") Car car, @Qualifier ("truck") Truck truck, @Qualifier("bike") Bike bike ){
//        this.car =car;
//        this.truck = truck;
//        this.bike = bike;
//    }


    //setterBase DI
//    private Vehicle bike;
//    private Vehicle truck;
//    private Vehicle car;
//
//    @Autowired
//    private void setStarter( @Qualifier("bike") Bike bike, @Qualifier ("car") Car car, @Qualifier("truck") Truck truck)
//    {
//        this.bike = bike;
//        this.truck =truck;
//        this.car =car;
//    };

        //Field Base DI
    @Autowired
    @Qualifier("car")
    private Vehicle car;

    @Autowired
    @Qualifier("bike")
    private Vehicle bike;

    @Autowired
    @Qualifier("truck")
    private Vehicle truck;


    @Override
    public void run(String... args) throws Exception {
        car.drivingLicense(false);
        car.model();
        car.price();

        truck.price();
        truck.drivingLicense(true);
        truck.price();

        bike.price();
        bike.model();
        bike.drivingLicense(false);


    }
}
