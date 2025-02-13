package com.rest_api.Rest.API.Prod.service;

import com.rest_api.Rest.API.Prod.model.Employee;
import com.rest_api.Rest.API.Prod.repository.EmployeeRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class EmployeeService {
    private final EmployeeRepository employeeRepository;
    public List<Employee> getAllEmployees()
    {
        return employeeRepository.findAll();
    }

    public Optional<Employee> getEmployeeByEmail(String email)
    {
        return employeeRepository.findByEmail(email);
    }
    public long getCountByDepartment(String department)
    {
        return employeeRepository.countByDepartment(department);
    }

    public void deleteEmployeeByEmail(String email)
    {
         employeeRepository.deleteEmployeeByEmail(email);
    }


}
