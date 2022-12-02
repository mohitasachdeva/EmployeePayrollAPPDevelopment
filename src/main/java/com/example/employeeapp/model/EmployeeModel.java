package com.example.employeeapp.model;

import com.example.employeeapp.dto.EmployeeDto;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;


@Entity //The entities are the persistence objects stores as a record in the database.
@Data // @Getter @Setter @Arg constructor @ no argu constructor @
public class EmployeeModel {
    public EmployeeModel( EmployeeDto employeeDto) {    //Save

        this.name = employeeDto.name;
        this.salary = employeeDto.salary;
        this.gender = employeeDto.gender;
        this.startDate = employeeDto.startDate;
        this.note = employeeDto.note;
        this.profilePic = employeeDto.profilePic;
    }

    public EmployeeModel() {

    }
    @Id //primary key

    @GeneratedValue (strategy= GenerationType.IDENTITY) //automatic id generate
    public int employeeId;
    private String name;

    public EmployeeModel(int employeeId,EmployeeDto employeeDto) {    //updating
        this.employeeId = employeeId;
        this.name = employeeDto.name;
        this.salary = employeeDto.salary;
        this.gender = employeeDto.gender;
        this.startDate = employeeDto.startDate;
        this.note = employeeDto.note;
        this.profilePic = employeeDto.profilePic;
    }
    private long salary;
    private String gender;
    private Long startDate;
    private String note;
    private String profilePic;

}
