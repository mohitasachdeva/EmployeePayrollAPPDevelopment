package com.example.employeeapp.controller;

import org.springframework.web.bind.annotation.*;

@RestController
public class EmployeeController {
    @GetMapping("/get")
    public String get() {
        return "welcome to the Employee PAyroll App";
    }

    @PostMapping("/AddEmp")
    public String addEmp(@RequestBody String empName, String empId, String empSalary, String empNote) {
        return "Employee Data" + empId + " " + empName + " " + empSalary + " " + empNote;

    }

    @PutMapping("/update/{empId}")
    public String updating(@PathVariable String empId, @RequestBody String empName,  String empSalary, String empNote) {
        return "Employee Data" + empId + " " + empName + " " + empSalary + " " + empNote;

    }

}
