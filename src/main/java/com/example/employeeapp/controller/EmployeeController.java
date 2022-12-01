package com.example.employeeapp.controller;

import com.example.employeeapp.dto.EmployeeDto;
import com.example.employeeapp.dto.ResponseDto;
import com.example.employeeapp.model.EmployeeModel;
import com.example.employeeapp.services.IEmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


import java.util.List;

@RestController // it indicates that  this class is a controller class .and it stores all the api
public class EmployeeController {
   @Autowired  // dependency injection

   private IEmployeeService employeeService;

    @PostMapping("/empadd") // for adding data
    public ResponseEntity<ResponseDto> save(@RequestBody EmployeeDto employeeDto){
        EmployeeModel employeeModel = employeeService.addEmp(employeeDto);
        ResponseDto responseDto = new ResponseDto("New Employee Added", employeeModel);
        ResponseEntity<ResponseDto> response = new ResponseEntity(responseDto, HttpStatus.OK);
        return response;
    }
    @GetMapping("/getting/{id}")
    public ResponseEntity<ResponseDto> gets(@PathVariable int id)
    {
         EmployeeModel employeeModel = employeeService.getById(id);
         ResponseDto responseDto = new ResponseDto("getting by id" , employeeModel);
         ResponseEntity<ResponseDto>response = new ResponseEntity<>(responseDto,HttpStatus.OK);
         return response;
    }
    @GetMapping("/all")
    public List<EmployeeModel> greetingModelsFindAll() {
        EmployeeModel employeeModel = (EmployeeModel) employeeService.getAllEmp();
        ResponseDto responseDto = new ResponseDto("getting all empdata" , employeeModel);
        ResponseEntity<ResponseDto>response = new ResponseEntity<>(responseDto,HttpStatus.OK);
        return (List<EmployeeModel>) response;
    }
    @PutMapping("/update/{id}") // for updating data
    public ResponseEntity<ResponseDto> greeting(@RequestBody EmployeeDto employeeDto, @PathVariable int id)
    {
        EmployeeModel employeeModel = employeeService.updateEmpData(employeeDto,id);
        ResponseDto responseDto = new ResponseDto("updating emp data" , employeeModel);
        ResponseEntity<ResponseDto>response = new ResponseEntity<>(responseDto,HttpStatus.OK);
        return response;
    }
    @DeleteMapping("/del/{id}") // for deleting data
    public ResponseEntity<ResponseDto> del(@PathVariable int id)
    {
        EmployeeModel employeeModel = employeeService.deleteByID(id);
        ResponseDto responseDto = new ResponseDto("getting by id" , employeeModel);
        ResponseEntity<ResponseDto>response = new ResponseEntity<>(responseDto,HttpStatus.OK);
        return response;

    }
}
