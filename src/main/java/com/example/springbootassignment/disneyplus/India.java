package com.example.springbootassignment.disneyplus;

import org.springframework.stereotype.Component;

@Component("india")
public class India extends DisneyPlus{

    public void subscriber(int count){
        System.out.println("Indian DisneyPlus subscriber:"+count);
    }

    public void subscriptionCharge(double amount){
        System.out.println("Charges for Indian Regions :"+amount);
    }
    public void discount(float percent){
        System.out.println("Discount to Indian Region is :"+percent);
    }

}
