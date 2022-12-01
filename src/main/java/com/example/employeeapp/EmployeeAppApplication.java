package com.example.employeeapp;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@Slf4j
public class EmployeeAppApplication {

    public static void main(String[] args) {

        SpringApplication.run(EmployeeAppApplication.class, args);
        log.info("Employee Payroll App Started");
    }

}
