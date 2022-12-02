package com.example.employeeapp.dto;


import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Pattern;

public class EmployeeDto {
 @NotEmpty(message = "Employee cannot be null")
 @Pattern(regexp = "^[A-Z]{1}[a-zA-Z\\s]{2,}$", message = "Employee name Invalid")
   public String name;
    public long salary;
    public String gender;
    public Long startDate;
    public String note;
    public String profilePic;

 public EmployeeDto(String name, long salary, String gender, Long startDate, String note, String profilePic) {
  this.name = name;
  this.salary = salary;
  this.gender = gender;
  this.startDate = startDate;
  this.note = note;
  this.profilePic = profilePic;
 }

}
