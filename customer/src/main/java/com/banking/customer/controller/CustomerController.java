/**
 * 
 */
package com.banking.customer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpRequest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.banking.customer.entity.Customer;
import com.banking.customer.exception.CustomerException;
import com.banking.customer.service.CustomerService;

/**
 * @author ritverma
 *
 */
@RestController
@RequestMapping(value="/customer")
public class CustomerController {

	@Autowired
	CustomerService customerService;
	@PostMapping
	public ResponseEntity<?> addCustomer(Customer customer)
	{
		/*try
		{*/
		System.out.println("In Controller");
	
			customerService.addCustomer(customer);
			System.out.println("exiting Controller");
			return new ResponseEntity<Customer>(customer,HttpStatus.CREATED);
	

		//}
	/*	catch(CustomerException e)
		{
			
		}*/
		
	}
}
