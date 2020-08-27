package com.solvewithajeet.springbootrestapi.controllers;

import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import com.solvewithajeet.springbootrestapi.entities.Book;
import com.solvewithajeet.springbootrestapi.services.BookService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
public class BookController {

    @Autowired
    private BookService bookService;

    @GetMapping(value="/books")
    public List<Book> getAllBooks() {
        return this.bookService.getAllBooks();
    }

    @GetMapping(value = "/book/{id}")
    public Book getBookById(@PathVariable("id") int id){
        return bookService.getBookById(id);
    }

    @PostMapping(value="/books")
    public Book addBook(@RequestBody Book book) {
        Book b = this.bookService.addBook(book);
        return b;
    }
    

}