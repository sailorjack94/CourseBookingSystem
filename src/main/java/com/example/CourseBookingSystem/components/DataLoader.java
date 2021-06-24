package com.example.CourseBookingSystem.components;

import com.example.CourseBookingSystem.controllers.BookingController;
import com.example.CourseBookingSystem.controllers.CourseController;
import com.example.CourseBookingSystem.controllers.CustomerController;
import com.example.CourseBookingSystem.models.Booking;
import com.example.CourseBookingSystem.models.Course;
import com.example.CourseBookingSystem.models.Customer;
import com.example.CourseBookingSystem.repositories.BookingRepository;
import com.example.CourseBookingSystem.repositories.CourseRepository;
import com.example.CourseBookingSystem.repositories.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements ApplicationRunner {

    @Autowired
    CourseRepository courseRepository;

    @Autowired
    CustomerRepository customerRepository;

    @Autowired
    BookingRepository bookingRepository;

    public void run(ApplicationArguments args) {


        Course softwareDevelopment = new Course("Software Development", "Edinburgh", 5);
        courseRepository.save(softwareDevelopment);

        Customer mark = new Customer("Mark", "Aberdeen", 33);
        customerRepository.save(mark);

        Customer niall = new Customer("Niall", "Glasgow", 27);
        customerRepository.save(niall);


        Booking booking1 = new Booking("29/3/21",softwareDevelopment,mark);
        bookingRepository.save(booking1);

    }

}
