package com.axxes.service;

import java.util.List;

/**
 * Created by Alex on 26/08/16.
 */
public interface BookService {
    List<String> getAllAuthors();

    void updateBookName(long id, String name);

    Integer getNumberOfBooks();
}