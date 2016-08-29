package com.axxes.persistence.domain;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by Alex on 26/08/16.
 */
@Entity
public class Rental {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "RENT_SEQ")
    @SequenceGenerator(name = "RENT_SEQ", sequenceName = "rental_sequence", initialValue = 10, allocationSize = 1)
    private long id;

    @ManyToOne
    private Book book;

    @ManyToOne
    private User user;

    private Date pickupDate;
    private Date returnDate;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Date getPickupDate() {
        return pickupDate;
    }

    public void setPickupDate(Date pickupDate) {
        this.pickupDate = pickupDate;
    }

    public Date getReturnDate() {
        return returnDate;
    }

    public void setReturnDate(Date returnDate) {
        this.returnDate = returnDate;
    }
}