package com.axxes.persistence.repository;

import com.axxes.persistence.domain.Book;
import org.springframework.data.jpa.domain.Specification;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

/**
 * Created by dhonorez on 29/08/16.
 */
public interface BookRepositoryCustom {

    Specification<Book> specification = new Specification<Book>() {
        @Override
        public Predicate toPredicate(Root<Book> root, CriteriaQuery<?> criteriaQuery, CriteriaBuilder criteriaBuilder) {
            return null;
        }
    }
}
