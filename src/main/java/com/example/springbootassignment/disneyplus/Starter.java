package com.example.springbootassignment.disneyplus;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class Starter implements CommandLineRunner {

    //constructor DI
//    private DisneyPlus india;
//    private DisneyPlus nepal;
//
//    @Autowired
//    public Starter(@Qualifier("india") India india, @Qualifier("nepal") Nepal nepal){
//        this.india = india;
//        this.nepal = nepal;
//    }

    //field base DI

    @Autowired
    @Qualifier("india")
    private DisneyPlus india;

    @Autowired
    @Qualifier("nepal")
    private DisneyPlus nepal;


    @Override
    public void run(String... args) throws Exception {
        nepal.subscriber(12);
        nepal.subscriptionCharge(3456);

        india.subscriptionCharge(5678);
        india.subscriber(54677);
    }
}
