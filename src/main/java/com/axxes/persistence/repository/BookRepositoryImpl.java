package com.axxes.persistence.repository;

import com.axxes.persistence.domain.Book;
import com.google.common.collect.Lists;
import org.springframework.beans.factory.annotation.Autowired;
import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import javax.persistence.EntityManager;
import java.util.List;

/**
 * Created by dhonorez on 29/08/16.
 */
public class BookRepositoryImpl implements BookRepositoryCustom {

    @Autowired
    private EntityManager entityManager;

    @Override
    public Book findBySomeId(Long id) {
        return entityManager.find(Book.class, id);
    }

    public List<Book> someCriteriaQuery() {
//        entityManager.createQuery();
        //This should be fixed
        throw new NotImplementedException();
    }
}
