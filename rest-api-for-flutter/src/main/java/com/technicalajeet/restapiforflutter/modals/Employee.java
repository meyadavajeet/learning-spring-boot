package com.technicalajeet.restapiforflutter.modals;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    private String EmployeeName;

    private int EmployeeAge;

    public Employee() {
    }

    public Employee(int id, String employeeName, int employeeAge) {
        this.id = id;
        EmployeeName = employeeName;
        EmployeeAge = employeeAge;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEmployeeName() {
        return EmployeeName;
    }

    public void setEmployeeName(String employeeName) {
        EmployeeName = employeeName;
    }

    public int getEmployeeAge() {
        return EmployeeAge;
    }

    public void setEmployeeAge(int employeeAge) {
        EmployeeAge = employeeAge;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", EmployeeName='" + EmployeeName + '\'' +
                ", EmployeeAge=" + EmployeeAge +
                '}';
    }
}
