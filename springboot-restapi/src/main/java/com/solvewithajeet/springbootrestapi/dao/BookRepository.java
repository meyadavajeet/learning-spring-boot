package com.solvewithajeet.springbootrestapi.dao;

import com.solvewithajeet.springbootrestapi.entities.Book;

import org.springframework.data.repository.CrudRepository;

public interface BookRepository extends CrudRepository<Book, Integer> {
    
    public Book findById(int id);
}
