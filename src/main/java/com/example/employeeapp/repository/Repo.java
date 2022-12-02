package com.example.employeeapp.repository;

import com.example.employeeapp.model.EmployeeModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository //It is a class-level annotation.
// The repository is a DAOs (Data Access Object) that access the database directly.
// The repository does all the operations related to the database.
public interface Repo extends JpaRepository<EmployeeModel,Integer> {

}
