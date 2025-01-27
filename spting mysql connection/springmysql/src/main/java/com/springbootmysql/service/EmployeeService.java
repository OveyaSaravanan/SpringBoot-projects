package com.springbootmysql.service;

import com.springbootmysql.model.Employee;
import com.springbootmysql.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;

    // Method to save employee
    public Employee saveEmployee(Employee employee) {
        return employeeRepository.save(employee);
    }

    // Method to get an employee by ID
    public Employee getEmployee(Long id) {
        return employeeRepository.findById(id).orElse(null);
    }

    // Additional methods like get all employees, delete, etc. can be added
}
