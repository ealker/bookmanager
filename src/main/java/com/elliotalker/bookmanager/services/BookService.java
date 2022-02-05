package com.elliotalker.bookmanager.services;

import com.elliotalker.bookmanager.model.Book;
import org.springframework.stereotype.Service;

import java.lang.reflect.Array;
import java.util.ArrayList;

@Service
public class BookService {

    public BookService() {
    }

    public Book getTestBook() {
        Book testBook = new Book(1,"My Test Book");
        return testBook;
    }

    public ArrayList<Book> getAllBooks() {
        Book testBook = new Book(1,"My Test Book");
        Book testBook2 = new Book(2, "Anohter Book");
        ArrayList<Book> bookArray = new ArrayList<>();
        bookArray.add(testBook);
        bookArray.add(testBook2);
        return bookArray;
    }


}
