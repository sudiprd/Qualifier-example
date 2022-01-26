package com.example.springbootassignment.employee;

import org.springframework.stereotype.Component;

@Component("new")
public class NewEmployee implements EmployeeInterface{

    @Override
    public void newEmployee(String name) {
        System.out.println(name+"New Employee has added in previous week");
    }

    @Override
    public void Salary(double amount) {
        System.out.println("Employee Salary has been listed"+amount);
    }

    @Override
    public void department(String depart) {
        System.out.println("Employee Departments is: "+ depart);
    }
}
