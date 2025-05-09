package com.example.demo.services;

import com.example.demo.dto.EmployeeDto;
import org.springframework.stereotype.Component;

@Component
public interface EmployeeService {
    EmployeeDto saveEmployee(EmployeeDto employeeDto);
}
