package com.raven.springbootmanytomany.repository;

import com.raven.springbootmanytomany.entity.Employee;

import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
}
