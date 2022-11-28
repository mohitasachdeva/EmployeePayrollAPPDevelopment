package com.example.employeeapp.services;

import com.example.employeeapp.model.EmployeeModel;
import com.example.employeeapp.repository.Repo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {
    @Autowired
    Repo repo;

    public String displayMessage() {
        return "Welcome to the Employee PayrollApp";
    }

    public EmployeeModel addEmp(EmployeeModel employeeModel) {
        return repo.save(employeeModel);
    }

    public EmployeeModel getById(int id) {
        EmployeeModel employeeModel = repo.findById(id).get();
        return employeeModel;

    }

    public List<EmployeeModel> getAllEmp() {
        List<EmployeeModel> employeeModels = repo.findAll();
        return employeeModels;
    }
    public EmployeeModel updateEmpData(EmployeeModel employeeModel,int id) {
        employeeModel = repo.findById(id).get();
        return employeeModel;
    }
    public void deleteByID(int id){
        repo.deleteById(id);

    }
}
