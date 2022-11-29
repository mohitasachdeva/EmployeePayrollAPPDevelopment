package com.example.employeeapp.services;

import com.example.employeeapp.dto.EmployeeDto;
import com.example.employeeapp.model.EmployeeModel;
import com.example.employeeapp.repository.Repo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeService {
    @Autowired
    Repo repo;

    public String displayMessage() {
        return "Welcome to the Employee PayrollApp";
    }

    public EmployeeModel addEmp(EmployeeDto employeeDto) {
        EmployeeModel employeeModel = new EmployeeModel(employeeDto);
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
    public EmployeeModel updateEmpData(EmployeeDto employeeDto,int id) {
        EmployeeModel employeeModel = new EmployeeModel((employeeDto));
        Optional<EmployeeModel> employeeModel1;
        employeeModel1 = repo.findById(id);
        employeeModel1.get().setName(employeeModel.getName());
        employeeModel1.get().setGender(employeeModel.getGender());
        employeeModel1.get().setNote(employeeModel.getNote());
        employeeModel1.get().setSalary(employeeModel.getSalary());
        employeeModel1.get().setProfilePic(employeeModel.getProfilePic());
        employeeModel1.get().setStartDate(employeeModel.getStartDate());
        repo.save(employeeModel1.get());
        return employeeModel1.get();
    }
    public void deleteByID(int id){
        repo.deleteById(id);

    }
}
