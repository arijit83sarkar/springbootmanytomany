package com.raven.springbootmanytomany.controller;

import com.raven.springbootmanytomany.entity.Employee;
import com.raven.springbootmanytomany.repository.EmployeeRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
@RequestMapping("/api/employee")
public class EmployeeController {
    @Autowired
    private EmployeeRepository employeeRepository;

    @PostMapping(value = "/saveEmployee")
    public String saveEmployee(@RequestBody Employee entity) {
        System.out.println("Employee save called...");

        // new Employee
        Employee employee = new Employee(entity.getName(), entity.getEmail(), entity.getTechnicalSkill());

        // save Employee
        employee = employeeRepository.save(employee);
        System.out.println("Saved employee :: " + employee);

        return "Employee saved!!!";
    }
}
