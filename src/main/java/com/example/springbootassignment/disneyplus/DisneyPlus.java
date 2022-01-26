package com.example.springbootassignment.disneyplus;

import org.springframework.stereotype.Component;

@Component
public abstract class DisneyPlus {

    private int count;
    private String names;
    private String dateOfJoining;

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public String getNames() {
        return names;
    }

    public void setNames(String names) {
        this.names = names;
    }

    public String getDateOfJoining() {
        return dateOfJoining;
    }

    public void setDateOfJoining(String dateOfJoining) {
        this.dateOfJoining = dateOfJoining;
    }

    public void subscriber(int count){
        System.out.println("DisneyPlus subscribers are increasing day by day");
    }

    public void subscriptionCharge(double amount){
        System.out.println("DisneyPlus price is varies for Different Region");
    }

}
