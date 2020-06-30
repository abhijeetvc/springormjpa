package com.jpa.springormjpa.repository;

import com.jpa.springormjpa.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface EmployeeRepository extends JpaRepository<Employee,Integer> {

    List<Employee> findByFirstNameAndLastName(String firstName, String lastName);
}
