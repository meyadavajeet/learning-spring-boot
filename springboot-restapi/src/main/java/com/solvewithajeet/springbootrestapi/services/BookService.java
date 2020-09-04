package com.solvewithajeet.springbootrestapi.services;

import java.util.List;

import com.solvewithajeet.springbootrestapi.dao.BookRepository;
import com.solvewithajeet.springbootrestapi.entities.Book;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
// @Service
public class BookService {

    @Autowired
    private BookRepository bookRepository;

    // private static List<Book> list = new ArrayList<>();

    // static {
    // list.add(new Book(12, "Complete java reference", "XYZ"));
    // list.add(new Book(13, "Complete Python reference", "abc"));
    // list.add(new Book(14, "Complete php reference", "lmn"));
    // list.add(new Book(15, "Complete mysql reference", "ajeet"));
    // }

    /**
     * get all books return book
     */
    public List<Book> getAllBooks() {
        List<Book> list = (List<Book>)this.bookRepository.findAll();
        return list;
    }

    /**
     * get single book by id return book
     */
    public Book getBookById(int id) {
        Book book = null;
        try {
            // book = list.stream().filter(e -> e.getId() == id).findFirst().get();
            book = this.bookRepository.findById(id);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return book;
    }

    /**
     * post book and add in the array list
     */
    public Book addBook(Book book) {
        // list.add(book);
        // return book;
        Book result = this.bookRepository.save(book);
        return result;
    }

    /**
     * delete book with respect with id
     * 
     * @param bid
     */
    public void deleteBook(int bid) {
        // list.stream().filter(book -> book.getId() != bid).collect(Collectors.toList());
        this.bookRepository.deleteById(bid);
    }

    /**
     * update book w.r.t bookId
     * 
     * @param book
     * @param bookId
     */
    public void updateBook(Book book, int bookId) {
        // list.stream().map(b -> {
        //     if (b.getId() == bookId) {
        //         b.setTitle(book.getTitle());
        //         b.setAuthor(book.getAuthor());
        //     }
        //     return b;
        // }).collect(Collectors.toList());
        book.setId(bookId);
        bookRepository.save(book);
    }
}