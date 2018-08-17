package com.axxes.service.impl;

import com.axxes.persistence.dao.BookDao;
import com.axxes.persistence.domain.Book;
import com.axxes.persistence.repository.BookRepository;
import com.axxes.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Created by Alex on 26/08/16.
 */
@Component
public class BookServiceImpl implements BookService {

    @Autowired
    private BookDao bookDao;

    @Autowired
    private BookRepository bookRepository;

    @Override
    public List<Book> getAllAuthors() {
        return bookDao.getAllAuthors();
    }

    @Override
    public void updateBookName(long id, String name) {
        bookDao.updateBookName(id, name);
    }

    @Override
    public Integer getNumberOfBooks() {
        return bookDao.getNumberOfBooks();
    }

    @Override
    public void updateBookTitle(long id, String title) {
        bookDao.updateBookTitle(id, title);
    }

    @Override
    public Iterable<Book> findAll() {
        return bookRepository.findAll();
    }
}