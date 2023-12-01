package com.getarrays.employeemanagerbackend.repo;

import com.getarrays.employeemanagerbackend.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepo extends JpaRepository<Employee, Long> {
}
