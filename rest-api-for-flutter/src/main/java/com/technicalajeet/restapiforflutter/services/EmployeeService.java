package com.technicalajeet.restapiforflutter.services;

import com.technicalajeet.restapiforflutter.modals.Employee;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface EmployeeService {

    public List<Employee> getAllEmployees();

    public Employee getEmployeeById(int id);

    public Employee addEmployee(Employee employee);

    public void deleteEmployeeById(int id);

    public void updateEmployee(Employee employee, int id);
}
