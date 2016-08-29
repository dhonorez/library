package com.axxes.persistence.repository;

import com.axxes.persistence.domain.Book;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by dhonorez on 29/08/16.
 */
public interface BookRepository extends CrudRepository<Book, Long>, BookRepositoryCustom, JpaSpecificationExecutor<Book> {
}
