package com.axxes.service.impl;

import com.axxes.persistence.dao.RentalDao;
import com.axxes.persistence.domain.Rental;
import com.axxes.service.RentalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.time.Instant;
import java.util.List;

/**
 * Created by Alex on 26/08/16.
 */
@Service
public class RentalServiceImpl implements RentalService {

    private final RentalDao rentalDao;

    public RentalServiceImpl(RentalDao rentalDao) {
        this.rentalDao = rentalDao;
    }

    @Override
    public List<Rental> getAllRentals() {
        return rentalDao.getAllRentals();
    }

    @Override
    public List<Rental> getRentalHistoryOfBook(String name) {
        return rentalDao.getRentalHistoryOfBook(name);
    }

    @Override
    public void createRental(long bookId, long userId) {
        rentalDao.createRental(bookId, userId, Instant.now());
    }

    @Override
    public void returnRental(long rentalId) {
        rentalDao.returnRental(rentalId, Instant.now());
    }

}
