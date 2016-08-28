package com.axxes.service.impl;

import com.axxes.service.BookService;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Created by Alex on 26/08/16.
 */
@Component
public class BookServiceImpl implements BookService {

    @Override
    public List<String> getAllAuthors() {
        return null;
    }

    @Override
    public void updateBookName(long id, String name) {
    }

    @Override
    public Integer getNumberOfBooks() {
        return null;
    }
}