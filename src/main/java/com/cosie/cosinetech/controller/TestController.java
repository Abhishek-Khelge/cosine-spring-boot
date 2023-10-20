package com.cosie.cosinetech.controller;

import com.cosie.cosinetech.entity.Employee;
import com.cosie.cosinetech.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@Controller
public class TestController {

    @Autowired
    EmployeeRepository employeeRepository;

    @GetMapping("name")
    public ResponseEntity<Integer> getName() {

        return ResponseEntity.ok(12882);
    }

    @PostMapping("/add")
    public ResponseEntity<Employee> addEmployee(@RequestBody Employee employee) {
        Employee employee1 = employeeRepository.save(employee);
        return ResponseEntity.ok(employee1);
    }
}
