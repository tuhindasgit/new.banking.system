package com.banking.customer;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.test.context.junit4.SpringRunner;

import com.banking.customer.entity.Address;
import com.banking.customer.entity.Customer;
import com.banking.customer.exception.CustomerException;
import com.banking.customer.repository.CustomerRepo;
import com.banking.customer.service.CustomerServiceImpl;

@Configuration
@PropertySource("message.properties")
@RunWith(SpringRunner.class)
@SpringBootTest
public class CustomerApplicationTests {

	@Mock
	CustomerRepo customerRepo;
	@Mock
	Environment environment;

	@InjectMocks
	CustomerServiceImpl custservice;

	@Test(expected=CustomerException.class)
	public void addCustomer() {
		Address address = new Address("airoli", "5678", "Mumbai");
		Customer customer = new Customer();
		customer.setFirstName("tuhin");
		when(customerRepo.save(Mockito.<Customer>any())).thenReturn(customer);
		when(environment.getProperty("Customer_Not_Found")).thenReturn("asaa");
		custservice.addCustomer(customer);
	}

}
