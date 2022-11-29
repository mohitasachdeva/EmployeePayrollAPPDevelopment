package com.example.employeeapp.controller;

import com.example.employeeapp.dto.EmployeeDto;
import com.example.employeeapp.model.EmployeeModel;
import com.example.employeeapp.services.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class EmployeeController {
    @Autowired
    EmployeeService employeeService;
    @GetMapping("/get")
    public String get() {
        return employeeService.displayMessage();
    }
    @PostMapping("/empadd")
    public EmployeeModel save(@RequestBody EmployeeDto employeeDto){
        return employeeService.addEmp(employeeDto);
    }
    @GetMapping("/getting/{id}")
    public EmployeeModel gets(@PathVariable int id)
    {
        return employeeService.getById(id);
    }
    @GetMapping("/all")
    public List<EmployeeModel> greetingModelsFindAll() {
        return employeeService.getAllEmp();
    }
    @PutMapping("/update/{id}")
    public EmployeeModel greeting(@RequestBody EmployeeDto employeeDto, @PathVariable int id)
    {
        return  employeeService.updateEmpData(employeeDto,id);
    }
    @DeleteMapping("/del/{id}")
    public void del(@PathVariable int id)
    {
        employeeService.deleteByID(id);

    }
}
