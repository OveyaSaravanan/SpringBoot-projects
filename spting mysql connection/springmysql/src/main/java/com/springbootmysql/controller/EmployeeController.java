package com.springbootmysql.controller;

import com.springbootmysql.model.Employee;
import com.springbootmysql.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/employees")
public class EmployeeController {

    @Autowired
    private EmployeeRepository employeeRepository;

    // Endpoint to insert data into the employee table
    @PostMapping("/add")
    public Employee addEmployee(@RequestBody Employee employee) {
        return employeeRepository.save(employee);
    }
}
