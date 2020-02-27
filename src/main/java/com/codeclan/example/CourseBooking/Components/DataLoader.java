package com.codeclan.example.CourseBooking.Components;

import com.codeclan.example.CourseBooking.Models.Booking;
import com.codeclan.example.CourseBooking.Models.Course;
import com.codeclan.example.CourseBooking.Models.Customer;
import com.codeclan.example.CourseBooking.Repositories.BookingRepositories.BookingRepository;
import com.codeclan.example.CourseBooking.Repositories.CourseRepositories.CourseRepository;
import com.codeclan.example.CourseBooking.Repositories.CustomerRepositories.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements ApplicationRunner {
    @Autowired
    CourseRepository courseRepository;

    @Autowired
    BookingRepository bookingRepository;

    @Autowired
    CustomerRepository customerRepository;

    public DataLoader(){

    }

    public void run(ApplicationArguments args){
        Course python = new Course("Intro to Python", "Inverness", 3);
        courseRepository.save(python);

        Course softwareDevelopment = new Course("Software Development", "Edinburgh", 5);
        courseRepository.save(softwareDevelopment);

        Customer cody = new Customer("Cody Abbott", "Edinburgh", 25);
        customerRepository.save(cody);

        Customer billy = new Customer("Billy McBilly", "Aberdeen", 21);
        customerRepository.save(billy);

        Customer rachel = new Customer("Rachel Davis", "Whitburn", 26);
        customerRepository.save(rachel);

        Booking billyBooking = new Booking("23-02-2019", python, billy);
        bookingRepository.save(billyBooking);

        Booking codyBooking = new Booking("14-02-2020", softwareDevelopment, cody);
        bookingRepository.save(codyBooking);

        Booking rachelBooking = new Booking("21-02-2020", softwareDevelopment, rachel);
        bookingRepository.save(rachelBooking);
    }
}
