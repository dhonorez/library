package com.axxes.service;

import com.axxes.persistence.domain.Book;

import java.util.List;

/**
 * Created by Alex on 26/08/16.
 */
public interface BookService {

    Iterable<Book> findAll();

    List<Book> getAllAuthors();

    void updateBookName(long id, String name);

    Integer getNumberOfBooks();

    void updateBookTitle(long id, String title);

}