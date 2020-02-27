package com.codeclan.example.CourseBooking.Projections;

import com.codeclan.example.CourseBooking.Models.Booking;
import com.codeclan.example.CourseBooking.Models.Course;
import com.codeclan.example.CourseBooking.Models.Customer;
import org.springframework.data.rest.core.config.Projection;

@Projection(name = "embedCourseAndCustomer", types = Booking.class)
public interface EmbedCourseAndCustomer {
    String getDate();
    Course getCourse();
    Customer getCustomer();
}
