package com.example.ems_backend.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
//to transfer data flow bte client na dserver or bte service and repository layer we use this dto class
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class EmployeeDto {

    private  long id;
    private  String firstName;
    private String lastName;
    private String email;
}
