package com.solvewithajeet.springbootrestapi.services;

import com.solvewithajeet.springbootrestapi.entities.Book;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
// @Service
public class BookService {

    private static List<Book> list = new ArrayList<>();

    static{
        list.add(new Book(12,"Complete java reference", "XYZ"));
        list.add(new Book(13,"Complete Python reference", "abc"));
        list.add(new Book(14,"Complete php reference", "lmn"));
        list.add(new Book(14,"Complete mysql reference", "ajeet"));
    }

    /**
     * get all books 
     * return book
     */
    public List<Book> getAllBooks(){
        return list;

    }

    /**
     * get single book by id
     * return book
     */
    public Book getBookById(int id){
        Book book = null;
        book = list.stream().filter(e->e.getId()==id).findFirst().get();
        return book;
    }

    
}