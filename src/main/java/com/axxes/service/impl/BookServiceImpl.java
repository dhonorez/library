package com.axxes.service.impl;

import com.axxes.persistence.dao.BookDao;
import com.axxes.persistence.domain.Book;
import com.axxes.persistence.repository.BookRepository;
import com.axxes.service.BookService;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Alex on 26/08/16.
 */
@Service
public class BookServiceImpl implements BookService {

    private final BookDao bookDao;
    private final BookRepository bookRepository;

    public BookServiceImpl(BookDao bookDao, BookRepository bookRepository) {
        this.bookDao = bookDao;
        this.bookRepository = bookRepository;
    }

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
