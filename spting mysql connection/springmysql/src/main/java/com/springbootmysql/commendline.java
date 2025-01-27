package com.springbootmysql;

import com.springbootmysql.model.Employee;
import com.springbootmysql.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class commendline implements CommandLineRunner {

    @Autowired
    private EmployeeRepository employeeRepository;

    public static void main(String[] args) {
        SpringApplication.run(commendline.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        // Add initial data to the database
        Employee employee1 = new Employee();
        employee1.setName("John Doe");
        employee1.setDepartment("IT");
        employee1.setSalary(75000.0);

        Employee employee2 = new Employee();
        employee2.setName("Jane Smith");
        employee2.setDepartment("HR");
        employee2.setSalary(65000.0);

        // Save employees to the database
        employeeRepository.save(employee1);
        employeeRepository.save(employee2);

        System.out.println("Employees added to the database successfully.");
    }
}
