package com.axxes.persistence.repository;

import com.axxes.persistence.domain.QBook;
import com.querydsl.core.types.dsl.BooleanExpression;

import java.time.LocalDate;

/**
 * Created by dhonorez on 29/08/16.
 */
public class BookCriteria {

    public static BooleanExpression fromThisYear() {
        return QBook.book.year.eq(LocalDate.now().getYear());
    }

}
