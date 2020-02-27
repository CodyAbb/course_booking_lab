package com.codeclan.example.CourseBooking.Repositories.BookingRepositories;

import com.codeclan.example.CourseBooking.Models.Booking;
import com.codeclan.example.CourseBooking.Projections.EmbedCourseAndCustomer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

@RepositoryRestResource(excerptProjection = EmbedCourseAndCustomer.class)
public interface BookingRepository extends JpaRepository<Booking, Long> {
    List<Booking> findByDate(String date);
}
