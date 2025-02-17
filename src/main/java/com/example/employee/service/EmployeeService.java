package com.example.employee.service;

import com.example.employee.model.EmployeeModel;
import com.example.employee.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;

    public EmployeeModel saveEmployee(EmployeeModel employee) {
        return employeeRepository.save(employee);
    }

    public List<EmployeeModel> getAllEmployees() {
        return employeeRepository.findAll();
    }
}