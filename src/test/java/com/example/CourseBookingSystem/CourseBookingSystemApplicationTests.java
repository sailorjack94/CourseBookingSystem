package com.example.CourseBookingSystem;

import com.example.CourseBookingSystem.models.Customer;
import com.example.CourseBookingSystem.repositories.CustomerRepository;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

@RunWith(SpringRunner.class)
@SpringBootTest
class CourseBookingSystemApplicationTests {

	@Autowired
	CustomerRepository customerRepository;

	@Test
	void contextLoads() {
	}

//	@Test
//	void canGetCustomerByCourseName(){
//		List<Customer> foundCustomers = customerRepository.findByCourseName("Software Development");
//		assertEquals(1, foundCustomers.size());
//
//	}

}
