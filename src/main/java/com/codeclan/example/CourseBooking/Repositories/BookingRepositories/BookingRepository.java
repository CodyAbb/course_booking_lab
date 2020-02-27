package com.codeclan.example.CourseBooking.Repositories.BookingRepositories;

import com.codeclan.example.CourseBooking.Models.Booking;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface BookingRepository extends JpaRepository<Booking, Long> {
}
