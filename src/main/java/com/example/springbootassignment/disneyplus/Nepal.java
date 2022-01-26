package com.example.springbootassignment.disneyplus;

import org.springframework.stereotype.Component;

@Component("nepal")
public class Nepal extends DisneyPlus{


    @Override
    public void subscriber(int count) {
        super.subscriber(count);
        System.out.println("Nepal Subscriber has Increasing Day by Day");
    }

    @Override
    public void subscriptionCharge(double amount) {
        System.out.println("DisneyPlus price for Nepal Region is:" +amount);
    }

    public void discount(float percent){
        System.out.println("Discount has provided to Nepal Region" + percent);
    }

}
