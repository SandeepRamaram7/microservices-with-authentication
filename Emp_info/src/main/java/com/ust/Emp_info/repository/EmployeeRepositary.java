package com.ust.Emp_info.repository;

import com.ust.Emp_info.Model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface EmployeeRepositary extends JpaRepository<Employee,Long> {
    Optional<Object> findByCcode(long ccode);
}
