package com.codeclan.example.CourseBooking.Components;

import com.codeclan.example.CourseBooking.Models.Booking;
import com.codeclan.example.CourseBooking.Repositories.BookingRepositories.BookingRepository;
import com.codeclan.example.CourseBooking.Repositories.CourseRepositories.CourseRepository;
import com.codeclan.example.CourseBooking.Repositories.CustomerRepositories.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;

public class DataLoader implements ApplicationRunner {
    @Autowired
    CourseRepository courseRepository;

    @Autowired
    BookingRepository bookingRepository;

    @Autowired
    CustomerRepository customerRepository;

    public void run(ApplicationArguments args){

    }
}
