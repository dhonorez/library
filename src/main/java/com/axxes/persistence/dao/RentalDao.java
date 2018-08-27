package com.axxes.persistence.dao;

import com.axxes.persistence.domain.Rental;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.time.Instant;
import java.util.List;

@Repository
public class RentalDao {

    public List<Rental> getAllRentals() {
        return null;
    }

    public List<Rental> getRentalHistoryOfBook(String name) {
        return null;
    }

    public void createRental(long bookId, long userId, Instant now) {

    }

    public void returnRental(long rentalId, Instant now) {

    }

}
