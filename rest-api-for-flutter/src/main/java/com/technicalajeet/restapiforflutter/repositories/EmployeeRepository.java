package com.technicalajeet.restapiforflutter.repositories;

import com.technicalajeet.restapiforflutter.modals.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

    public Employee findById(int id);
}
