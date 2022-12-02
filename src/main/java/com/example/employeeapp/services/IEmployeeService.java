package com.example.employeeapp.services;

import com.example.employeeapp.dto.EmployeeDto;
import com.example.employeeapp.exception.EmployeePayrollException;
import com.example.employeeapp.model.EmployeeModel;

import java.util.List;

public interface IEmployeeService {
   EmployeeModel addEmp(EmployeeDto employeeDto);

     EmployeeModel getById(int id) throws EmployeePayrollException;
    List<EmployeeModel> getAllEmp();
     EmployeeModel updateEmpData(EmployeeDto employeeDto , int id) throws EmployeePayrollException;
     EmployeeModel deleteByID(int id);


}
