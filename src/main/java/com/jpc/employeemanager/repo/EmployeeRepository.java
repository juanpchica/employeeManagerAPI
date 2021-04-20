package com.jpc.employeemanager.repo;

import com.jpc.employeemanager.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee,Long> {
    void deleteEmployeeById(Long id);

    Employee findEmployeeById(Long id);
}
