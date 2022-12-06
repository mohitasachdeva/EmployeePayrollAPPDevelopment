package com.example.employeeapp.dto;


import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.validation.constraints.*;
import lombok.ToString;

import java.util.List;

public @ToString class EmployeeDto {
 @NotEmpty(message = "Employee cannot be null")
 @Pattern(regexp = "^[A-Z]{1}[a-zA-Z\\s]{2,}$", message = "Employee name Invalid")
   public String name;
 @Min(value=500,message = "minimum wages should be more then 500")
    public long salary;
 @Pattern(regexp = "male|female",message = "gender needs to be male or female")
    public String gender;
 @JsonFormat(pattern = "dd mm yyyy")
 @NotNull(message = "start date should not be empty")
// @PastOrPresent(message = "startDate should be past or todays date")
    public Long startDate;
 @NotBlank(message = "note cannot be empty")
    public String note;
 @NotBlank(message = "profilepic cannot be empty")
    public String profilePic;
 @NotEmpty(message = "department cannot be empty")
    public List<String> department;



 public EmployeeDto(String name, long salary, String gender, Long startDate, String note, String profilePic,List<String >department) {
  this.name = name;
  this.salary = salary;
  this.gender = gender;
  this.startDate = startDate;
  this.note = note;
  this.profilePic = profilePic;
  this.department = department;
 }

}
