package com.axxes.persistence.repository.impl;

import com.axxes.persistence.domain.Book;
import com.axxes.persistence.domain.Book_;
import com.axxes.persistence.repository.BookRepositoryCustom;
import org.springframework.beans.factory.annotation.Autowired;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.*;
import java.time.LocalDate;
import java.util.List;

/**
 * Created by dhonorez on 29/08/16.
 */
public class BookRepositoryCustomImpl implements BookRepositoryCustom {

    @Autowired
    private EntityManager entityManager;

    public List<Book> testCriteria() {
        CriteriaBuilder cb = entityManager.getCriteriaBuilder();
        CriteriaQuery cq = cb.createQuery(Book.class);
        Root<Book> book = cq.from(Book.class);

        ParameterExpression<Integer> p = cb.parameter(Integer.class);
        cq.select(book).where(cb.gt(book.get(Book_.year), p));

        TypedQuery<Book> query = entityManager.createQuery(cq);
        return query.getResultList();
    }

    public List<Book> testIsVeryRecentOrVeryOld() {
        LocalDate today = LocalDate.now();

        CriteriaBuilder builder = entityManager.getCriteriaBuilder();
        CriteriaQuery<Book> query = builder.createQuery(Book.class);
        Root<Book> root = query.from(Book.class);

        Predicate isFromCurrentYear = builder.equal(root.get(Book_.year), today.getYear());
        Predicate olderThanFiveYears = builder.lessThan(root.get(Book_.year), today.minusYears(10).getYear());
        query.where(builder.or(isFromCurrentYear, olderThanFiveYears));

        return entityManager.createQuery(query.select(root)).getResultList();
    }

}
