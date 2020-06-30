package com.jpa.springormjpa.controller;

import com.jpa.springormjpa.model.Employee;
import com.jpa.springormjpa.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class EmployeeController {

    @Autowired
    private EmployeeRepository employeeRepository;

    @PostMapping(value="/save")
    public String saveEmp(@RequestBody Employee employee){
        employeeRepository.save(employee);
        return "Employee saved";
    }

    @GetMapping(value="/getlist")
    public List<Employee> getList(){
        return employeeRepository.findAll();
    }

    @GetMapping(value="/getemp/{id}")
    public Optional<Employee> getEmp(@PathVariable Integer id){
        return employeeRepository.findById(id);
    }

    @GetMapping(value="/getemp/{firstName}/{lastName}")
    public List<Employee> getList1(@PathVariable String firstName,
                                   @PathVariable String lastName){
        return employeeRepository.findByFirstNameAndLastName(firstName,lastName);
    }

}
