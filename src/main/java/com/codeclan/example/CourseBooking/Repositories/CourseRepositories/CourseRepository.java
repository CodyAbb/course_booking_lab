package com.codeclan.example.CourseBooking.Repositories.CourseRepositories;

import com.codeclan.example.CourseBooking.Models.Course;
import com.codeclan.example.CourseBooking.Models.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

@RepositoryRestResource
public interface CourseRepository extends JpaRepository<Course, Long> {
    List<Course> findByStarRating(int starRating);
    List<Course> findByBookingsCustomerNameIgnoreCase(String customerName);
}
