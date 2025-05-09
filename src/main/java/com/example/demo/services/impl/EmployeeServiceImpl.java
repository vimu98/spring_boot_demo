package com.example.demo.services.impl;

import com.example.demo.dto.EmployeeDto;
import com.example.demo.entity.Employee;
import com.example.demo.repo.EmployeeRepo;
import com.example.demo.services.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    public EmployeeRepo employeeRepo;

    public EmployeeServiceImpl(EmployeeRepo employeeRepo) {
        this.employeeRepo = employeeRepo;
    }

    @Override
    public EmployeeDto saveEmployee(EmployeeDto employeeDto) {
        Employee employee = new Employee();
        employee.setId(employeeDto.getId());
        employee.setName(employeeDto.getName());
        employee.setEmail(employeeDto.getEmail());
        employee.setPhone(employeeDto.getPhone());

        Employee savedEmployee = employeeRepo.save(employee);

        EmployeeDto savedEmployeeDto = new EmployeeDto();
        savedEmployeeDto.setId(savedEmployee.getId());
        savedEmployeeDto.setName(savedEmployee.getName());
        savedEmployeeDto.setEmail(savedEmployee.getEmail());
        savedEmployeeDto.setPhone(savedEmployee.getPhone());

        return savedEmployeeDto;


    }
}
