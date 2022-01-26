package com.example.springbootassignment.employee;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class Starter implements CommandLineRunner {

    //constructor DI
    private EmployeeInterface newEmployee;
    private EmployeeInterface onlineEmployee;
    private EmployeeInterface oldEmployee;

    @Autowired
    public Starter(@Qualifier("new") NewEmployee newEmployee, @Qualifier("online") OnlineEmployee onlineEmployee){
        this.newEmployee= newEmployee;
        this.onlineEmployee = onlineEmployee;
    }

    @Override
    public void run(String... args) throws Exception {
        newEmployee.department("Accounting");
        newEmployee.Salary(800000);
        newEmployee.newEmployee("Sudip");

        onlineEmployee.newEmployee("Bikas");
        onlineEmployee.Salary(900000);
        onlineEmployee.department("Logistics");

        oldEmployee.department("Programming");
        oldEmployee.Salary(100000);
        oldEmployee.newEmployee("Satish");


    }
}
