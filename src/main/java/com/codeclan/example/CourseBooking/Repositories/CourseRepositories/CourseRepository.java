package com.codeclan.example.CourseBooking.Repositories.CourseRepositories;

import com.codeclan.example.CourseBooking.Models.Course;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CourseRepository extends JpaRepository<Course, Long> {
}
