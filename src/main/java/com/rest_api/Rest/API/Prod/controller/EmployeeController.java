package com.rest_api.Rest.API.Prod.controller;

import com.rest_api.Rest.API.Prod.model.Employee;
import com.rest_api.Rest.API.Prod.repository.EmployeeRepository;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/employee")
@RequiredArgsConstructor
public class EmployeeController {
    private final EmployeeRepository repository;

    @GetMapping()
    public List<Employee> getAll()
    {
        return repository.findAll();
    }

    @GetMapping("/getByDepartment/{department}")
    public List<Employee> getByDepartment(@PathVariable String department)
    {
        return repository.findByDepartment(department);
    }

    @GetMapping("/countByDepartment/{department}")
    public Long countByDepartment(@PathVariable String department)
    {
        return repository.countByDepartment(department);
    }

    @DeleteMapping("/{email}")
    @Transactional
    public void deleteEmployee(@PathVariable String email) {
         repository.deleteEmployeeByEmail(email);
    }
    @PostMapping
    public Employee createEmployee(@RequestBody Employee employee) {
        return repository.save(employee);
    }
}
