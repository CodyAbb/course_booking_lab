package com.codeclan.example.CourseBooking.Controllers;

import com.codeclan.example.CourseBooking.Repositories.BookingRepositories.BookingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/bookings")
public class BookingController {
    @Autowired
    BookingRepository bookingRepository;
}
