package com.solvewithajeet.springbootrestapi.controllers;

import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import com.solvewithajeet.springbootrestapi.entities.Book;
import com.solvewithajeet.springbootrestapi.services.BookService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
public class BookController {

    @Autowired
    private BookService bookService;

    /**
     * Get All books handler
     */
    @GetMapping(value = "/books")
    public List<Book> getAllBooks() {
        return this.bookService.getAllBooks();
    }

    /**
     * Get single book respect to id handler
     */
    @GetMapping(value = "/book/{id}")
    public Book getBookById(@PathVariable("id") int id) {
        return bookService.getBookById(id);
    }

    /**
     * create new book
     * 
     * @param book
     * @return
     */
    @PostMapping(value = "/books")
    public Book addBook(@RequestBody Book book) {
     Book books = this.bookService.addBook(book);
     return books;
    }
/**
 * delete book respect to id
 * @param bookId
 */
    @DeleteMapping(value = "/books/{bookId}")
    public void deleteBook(@PathVariable("bookId") int bookId) {
        this.bookService.deleteBook(bookId);
    }

    @PutMapping(value ="/books/{bookId}")
    public Book updateBook(@RequestBody Book book, @PathVariable("bookId") int bookId){
        this.bookService.updateBook(book, bookId);
        return book;
    }

}