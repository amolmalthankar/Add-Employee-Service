package com.employee.service.status.addemployeeservice.controller;


import com.employee.service.status.addemployeeservice.service.AddEmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/rest/employee")
public class AddEmployeeController {

    @Autowired
    private AddEmployeeService addEmployeeService;

    @PostMapping("/add")
    public String addEmployeeDetails() {
        return addEmployeeService.addEmployeeDetails();
    }


}
