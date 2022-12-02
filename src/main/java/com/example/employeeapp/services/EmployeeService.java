package com.example.employeeapp.services;

import com.example.employeeapp.dto.EmployeeDto;
import com.example.employeeapp.exception.EmployeePayrollException;
import com.example.employeeapp.model.EmployeeModel;
import com.example.employeeapp.repository.Repo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service  // it indicates this class is a service class
public  class EmployeeService implements IEmployeeService{
    private  List<EmployeeModel> employeeModellist =new ArrayList();
   @Autowired //dependency injection
    Repo repo; // it is the object of Repository class it save all data in databases


    public EmployeeModel addEmp(EmployeeDto employeeDto) {
        EmployeeModel employeeModel = new EmployeeModel(employeeDto);
        employeeModellist.add(employeeModel);
        return repo.save(employeeModel);
    }

    public EmployeeModel getById(int id) throws EmployeePayrollException {
       EmployeeModel employeeModel1 = employeeModellist.stream().filter(employeeModel -> employeeModel.getEmployeeId()==id).findFirst().orElseThrow(() -> new EmployeePayrollException("Employee id not present"));


        return employeeModel1;

    }

    public List<EmployeeModel> getAllEmp() {
        List<EmployeeModel> employeeModels = repo.findAll();
        return employeeModels;
    }
    public EmployeeModel updateEmpData(EmployeeDto employeeDto,int id) throws EmployeePayrollException {
        EmployeeModel employeeModel2 = employeeModellist.stream().filter(employeeModel -> employeeModel.getEmployeeId()==id).findFirst().orElseThrow(() -> new EmployeePayrollException("Employee id not present"));

        employeeModel2.setName(employeeDto.name);
        employeeModel2.setSalary(employeeDto.salary);
        return employeeModel2;
    }
    public EmployeeModel deleteByID(int id){
        repo.deleteById(id);

        return null;
    }


}
