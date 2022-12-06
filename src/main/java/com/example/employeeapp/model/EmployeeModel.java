package com.example.employeeapp.model;

import com.example.employeeapp.dto.EmployeeDto;
import jakarta.persistence.*;

import lombok.Data;


import java.util.List;


@Entity //The entities are the persistence objects stores as a record in the database.
// @Getter @Setter @Arg constructor @ no argu constructor @
public @Data class EmployeeModel {

    public EmployeeModel() {

    }
    @Id //primary key
    @GeneratedValue (strategy= GenerationType.IDENTITY) //automatic id generate
    @Column(name = "employee_id")
    private int employeeId;
@Column(name = "name")
    private String name;
    private long salary;
    private String gender;
    private Long startDate;
    private String note;
    private String profilePic;
    @ElementCollection
    @CollectionTable(name = "employee_department",joinColumns = @JoinColumn(name = "id"))
 private List <String> department;

public  EmployeeModel( EmployeeDto employeeDto) {    //Save

        this.name = employeeDto.name;
        this.salary = employeeDto.salary;
        this.gender = employeeDto.gender;
        this.startDate = employeeDto.startDate;
        this.note = employeeDto.note;
        this.profilePic = employeeDto.profilePic;
        this.department = employeeDto.department;
    }


    public EmployeeModel(int employeeId,EmployeeDto employeeDto) {    //updating
        this.employeeId = employeeId;
        this.name = employeeDto.name;
        this.salary = employeeDto.salary;
        this.gender = employeeDto.gender;
        this.startDate = employeeDto.startDate;
        this.note = employeeDto.note;
        this.profilePic = employeeDto.profilePic;
        this.department = employeeDto.department;
    }



}
