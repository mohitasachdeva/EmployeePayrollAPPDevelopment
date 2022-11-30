package com.example.employeeapp.services;

import com.example.employeeapp.dto.EmployeeDto;
import com.example.employeeapp.model.EmployeeModel;

import java.util.List;

public interface IEmployeeService {
   EmployeeModel addEmp(EmployeeDto employeeDto);

     EmployeeModel getById(int id);
    List<EmployeeModel> getAllEmp();
     EmployeeModel updateEmpData(EmployeeDto employeeDto , int id);
     void deleteByID(int id);


}
