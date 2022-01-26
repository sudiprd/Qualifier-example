package com.example.springbootassignment.employee;


import org.springframework.stereotype.Component;

@Component("online")
public class OnlineEmployee implements EmployeeInterface{

    @Override
    public void newEmployee(String name) {
        System.out.println("new Virtual employee has been added"+name);
    }

    @Override
    public void Salary(double amount) {
        System.out.println("Salary for the Virtual Employee is "+amount);
    }

    @Override
    public void department(String depart) {
        System.out.println("Department is "+depart);
    }
}
