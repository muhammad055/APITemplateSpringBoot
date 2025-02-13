package com.rest_api.Rest.API.Prod.repository;

import com.rest_api.Rest.API.Prod.model.Employee;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;

import java.util.List;
import java.util.Optional;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {
    Optional<Employee> findByEmail(String email);
    List<Employee> findByDepartment(String department);
    long countByDepartment(String department);
    void deleteEmployeeByEmail(String email);
}
