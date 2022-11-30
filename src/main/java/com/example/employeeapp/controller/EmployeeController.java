package com.example.employeeapp.controller;

import com.example.employeeapp.dto.EmployeeDto;
import com.example.employeeapp.model.EmployeeModel;
import com.example.employeeapp.services.IEmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


import java.util.List;

@RestController // it indicates that  this class is a controller class .and it stores all the api
public class EmployeeController {
   @Autowired  // dependency injection

   private IEmployeeService employeeService;

    @PostMapping("/empadd") // for adding data
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
    @PutMapping("/update/{id}") // for updating data
    public EmployeeModel greeting(@RequestBody EmployeeDto employeeDto, @PathVariable int id)
    {
        return  employeeService.updateEmpData(employeeDto,id);
    }
    @DeleteMapping("/del/{id}") // for deleting data
    public void del(@PathVariable int id)
    {
        employeeService.deleteByID(id);

    }
}
