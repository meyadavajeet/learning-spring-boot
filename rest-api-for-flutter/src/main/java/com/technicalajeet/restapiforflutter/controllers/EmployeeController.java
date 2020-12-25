package com.technicalajeet.restapiforflutter.controllers;

import com.technicalajeet.restapiforflutter.modals.Employee;
import com.technicalajeet.restapiforflutter.services.EmployeeServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(path = "api/v1")
public class EmployeeController {

    @Autowired
    EmployeeServiceImpl service;

    @GetMapping("/")
    public String index() {
        return "RestApi is working";
    }

    @GetMapping(value = "/employee")
    public ResponseEntity<List<Employee>> getAllEmployees() {
        List<Employee> list = service.getAllEmployees();
        if (list.size() <= 0) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
        }
        return ResponseEntity.of(Optional.of(list));
    }

    @GetMapping(value = "/employee/{id}")
    public ResponseEntity<Employee> getBookById(@PathVariable("id") int id) {
        Employee employee = service.getEmployeeById(id);
        if (employee == null) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
        }
        return ResponseEntity.of(Optional.of(employee));
    }

    @PostMapping(value = "/employee")
    public ResponseEntity<Employee> addBook(@RequestBody Employee employee) {
        Employee employees = null;

        try {
            employees = this.service.addEmployee(employee);
            System.out.println(employees);
            // return ResponseEntity.of(Optional.of(books));
            return ResponseEntity.status(HttpStatus.CREATED).body(employee);
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
        }
        // Book books = this.bookService.addBook(book);
        // return books;
    }

    @DeleteMapping(value = "/employee/{id}")
    public ResponseEntity<Void> deleteEmployee(@PathVariable("id") int id) {
        try {
            this.service.deleteEmployeeById(id);
            return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
        }
    }


    @PutMapping(value = "/employee/{id}")
    public ResponseEntity<Employee> updateEmployee(@RequestBody Employee employee, @PathVariable("id") int id) {
        try {
            this.service.updateEmployee(employee, id);
            return ResponseEntity.ok().body(employee);
        } catch (Exception e) {
            e.printStackTrace();
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
        }

    }


}
