package com.example.springbootassignment.employee;

import org.springframework.stereotype.Component;

@Component("old")
public class OldEmployee implements EmployeeInterface{

    @Override
    public void newEmployee(String name) {
        System.out.println("Old Employee is :"+name);
    }

    @Override
    public void Salary(double amount) {
        System.out.println("Salary of an Employee is "+amount);
    }

    @Override
    public void department(String depart) {
        System.out.println("Old Employee Department is :"+depart);
    }

    public void lifeInsurance(boolean insurance){
        System.out.println("Life insurance has provided to Old Employee");
    }
}
