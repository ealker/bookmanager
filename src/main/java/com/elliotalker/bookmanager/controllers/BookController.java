package com.elliotalker.bookmanager.controllers;

import com.elliotalker.bookmanager.model.Book;
import com.elliotalker.bookmanager.services.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
public class BookController {

    @Autowired
    BookService bookService;

    private final String API_VERSION = "/api/v1/";

    @GetMapping(API_VERSION + "books/")
    public ArrayList<Book> getAllBooks(){
        return bookService.getAllBooks();
    }

    @GetMapping(API_VERSION + "books/{id}")
    public Book getBook(@PathVariable String id){
        BookService
    }
}
