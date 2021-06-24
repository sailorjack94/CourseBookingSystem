package com.example.CourseBookingSystem.controllers;

import com.example.CourseBookingSystem.models.Course;
import com.example.CourseBookingSystem.models.Customer;
import com.example.CourseBookingSystem.repositories.CourseRepository;
import com.example.CourseBookingSystem.repositories.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CustomerController {

    @Autowired
    CustomerRepository customerRepository;

    @GetMapping(value = "/customers")
    public ResponseEntity<List<Customer>> getAllCustomers(){
        return new ResponseEntity<>(customerRepository.findAll(), HttpStatus.OK);
    }

    @GetMapping(value = "/customers/booking")
    public ResponseEntity<List<Customer>> getByCourseName(@RequestParam(name = "courseName", required = false) String courseName){
        return new ResponseEntity<>(customerRepository.findByBookingsCourseNameIgnoreCase(courseName),HttpStatus.OK);
    }

    @GetMapping(value= "customers/town")
    public ResponseEntity<List<Customer>> getByTownAndCourseName(
            @RequestParam(name = "town", required = false) String town,
            @RequestParam(name = "courseName", required = false) String courseName
    ){
        return new ResponseEntity<>(customerRepository.findByTownAndBookingsCourseName(town, courseName), HttpStatus.OK);
    }

    @GetMapping(value= "customers/age")
    public ResponseEntity<List<Customer>> getByAgeAndTownAndCourseName(
            @RequestParam(name = "minAge", required = false) int minAge,
            @RequestParam(name = "town", required = false) String town,
            @RequestParam(name = "courseName", required = false) String courseName
    ){
        return new ResponseEntity<>(customerRepository.findByAgeGreaterThanAndTownIgnoreCaseAndBookingsCourseNameIgnoreCase(minAge, town, courseName), HttpStatus.OK);
    }



}
