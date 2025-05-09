package com.example.demo.controller;

import com.example.demo.dto.EmployeeDto;
import com.example.demo.services.EmployeeService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/employee")
public class EmployeeController {

    private EmployeeService employeeService;

    EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @PostMapping
    public ResponseEntity<EmployeeDto> saveEmployee(@RequestBody EmployeeDto employeeDto){
        EmployeeDto employee = employeeService.saveEmployee(employeeDto);
        return new ResponseEntity<>(employee, HttpStatus.CREATED);
    }

    @GetMapping
    public void loadEmployee(){

    }

    @DeleteMapping
    public void deleteEmployee(){

    }

    @PutMapping
    public void editEmployee(){

    }

    @GetMapping("/{id}")
    public void getEmployeeById(){

    }
}
