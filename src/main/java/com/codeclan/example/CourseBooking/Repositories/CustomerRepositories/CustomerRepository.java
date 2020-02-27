package com.codeclan.example.CourseBooking.Repositories.CustomerRepositories;

import com.codeclan.example.CourseBooking.Models.Course;
import com.codeclan.example.CourseBooking.Models.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

@RepositoryRestResource
public interface CustomerRepository extends JpaRepository<Customer, Long> {
    List<Customer> findByBookingsCourseName(String courseName);
}
