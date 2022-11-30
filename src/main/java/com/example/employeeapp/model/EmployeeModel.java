package com.example.employeeapp.model;

import com.example.employeeapp.dto.EmployeeDto;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;



@Entity
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

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getSalary() {
        return salary;
    }

    public void setSalary(long salary) {
        this.salary = salary;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Long getStartDate() {
        return startDate;
    }

    public void setStartDate(Long startDate) {
        this.startDate = startDate;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public String getProfilePic() {
        return profilePic;
    }

    public void setProfilePic(String profilePic) {
        this.profilePic = profilePic;
    }

    @Id //primary key
    @GeneratedValue //automatic id generate
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
