package com.elliotalker.bookmanager.controllers;

import com.elliotalker.bookmanager.model.Book;
import com.elliotalker.bookmanager.services.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
@RequestMapping(path = "/api/v1/")
public class BookController {

    @Autowired
    BookService bookService;

    @GetMapping("books")
    public ArrayList<Book> getAllBooks(){
        return bookService.getAllBooks();
    }

    @GetMapping("books/{id}")
    public Book getBook(@PathVariable String id){
        return bookService.getTestBook();
    }
}
