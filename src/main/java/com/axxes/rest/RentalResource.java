package com.axxes.rest;

import com.axxes.service.RentalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Alex on 26/08/16.
 */
@Component
@RestController
@RequestMapping("/rental")
public class RentalResource {

    @Autowired
    private RentalService rentalService;
}