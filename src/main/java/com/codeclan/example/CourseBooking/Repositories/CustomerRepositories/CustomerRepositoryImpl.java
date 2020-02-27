package com.codeclan.example.CourseBooking.Repositories.CustomerRepositories;

import org.springframework.beans.factory.annotation.Autowired;

import javax.persistence.EntityManager;

public class CustomerRepositoryImpl {

    @Autowired
    EntityManager entityManager;
}
