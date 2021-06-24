package com.example.CourseBookingSystem.repositories;

import com.example.CourseBookingSystem.models.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Long> {

    List<Customer> findByBookingsCourseNameIgnoreCase(String courseName);


    //get all customers in given town for given course
    List<Customer> findByTownAndBookingsCourseName(String town, String courseName);


    //get all customers over certain age in a given town for a given course
    List<Customer> findByAgeGreaterThanAndTownIgnoreCaseAndBookingsCourseNameIgnoreCase(int age, String town, String courseName);
}
