package com.technicalajeet.restapiforflutter.services;

import com.technicalajeet.restapiforflutter.modals.Employee;
import com.technicalajeet.restapiforflutter.repositories.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    EmployeeRepository employeeRepository;


    @Override
    public List<Employee> getAllEmployees() {
        List<Employee> list = (List<Employee>) this.employeeRepository.findAll();
        return list;
    }

    @Override
    public Employee getEmployeeById(int id) {
      Employee employee = null;
        try {
            employee = employeeRepository.findById(id);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return employee;
    }

    @Override
    public Employee addEmployee(Employee employee) {
        Employee result = this.employeeRepository.save(employee);
        return result;
    }

    @Override
    public void deleteEmployeeById(int id) {
        employeeRepository.deleteById(id);
    }

    @Override
    public void updateEmployee(Employee employee, int id) {
        employee.setId(id);
        employeeRepository.save(employee);
    }
}
