package com.example.employeeapp.services;

import com.example.employeeapp.dto.EmployeeDto;
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

    public EmployeeModel getById(int id) {
        EmployeeModel employeeModel = repo.findById(id).get();
        employeeModellist.add(employeeModel);
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
        employeeModellist.add(employeeModel1.get());
        repo.save(employeeModel1.get());
        return employeeModel1.get();
    }
    public EmployeeModel deleteByID(int id){
        repo.deleteById(id);

        return null;
    }


}
