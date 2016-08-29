package com.axxes.service.impl;

import com.axxes.persistence.domain.Book;
import com.axxes.persistence.repository.BookRepository;
import com.axxes.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Component;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;
import java.util.List;

/**
 * Created by Alex on 26/08/16.
 */
@Component
public class BookServiceImpl implements BookService {

    @Autowired
    private BookRepository bookRepository;

    @Override
    public List<String> getAllAuthors() {

        return bookRepository.;
    }

    @Override
    public void updateBookName(long id, String name) {
    }

    @Override
    public Integer getNumberOfBooks() {
        return null;
    }

    @Override
    public Iterable<Book> findAll() {
        return bookRepository.findAll();
    }
}