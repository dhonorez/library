package com.axxes.rest;

import com.axxes.persistence.domain.Rental;
import com.axxes.service.RentalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by Alex on 26/08/16.
 */
@Component
@RestController
@RequestMapping("/rental")
public class RentalResource {

    private final RentalService rentalService;

    public RentalResource(RentalService rentalService) {
        this.rentalService = rentalService;
    }

    @RequestMapping(value = "/all", method = RequestMethod.GET)
    public List<Rental> getAllRentals() {
        return rentalService.getAllRentals();
    }

    @RequestMapping(value = "/history/{name}", method = RequestMethod.GET)
    public List<Rental> getRentalHistoryOfBook(@PathVariable String name) {
        return rentalService.getRentalHistoryOfBook(name);
    }

    @RequestMapping(value = "/create/{bookId}/user/{userId}", method = RequestMethod.POST)
    public void createRental(@PathVariable long bookId,
                             @PathVariable long userId) {
        rentalService.createRental(bookId, userId);
    }

    @RequestMapping(value = "/return/{rentalId}/user/{userId}", method = RequestMethod.POST)
    public void returnRental(@PathVariable long rentalId) {
        rentalService.returnRental(rentalId);
    }

}
