package com.employee.service.status.addemployeeservice.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class AddEmployeeService {

    @Autowired
    private RestTemplate restTemplate;

    @Value("${dbservice.name}")
    private String dbServicePath;

    public String addEmployeeDetails() {
        return restTemplate.postForObject("http://"+dbServicePath+"/rest/db/add", null, String.class);
    }
}
