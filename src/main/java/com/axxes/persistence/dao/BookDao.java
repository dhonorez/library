package com.axxes.persistence.dao;

import com.axxes.persistence.domain.Book;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class BookDao {

    public List<Book> getAllAuthors() {
        return null;
    }

    public void updateBookName(long id, String name) {
    }

    public Integer getNumberOfBooks() {
        return null;
    }

    public void updateBookTitle(long id, String title) {

    }

}
