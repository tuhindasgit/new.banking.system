/**
 * 
 */
package com.banking.customer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
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
@RequestMapping(value = "/customer")
public class CustomerController {

	@Autowired
	CustomerService customerService;

	@PostMapping
	public ResponseEntity<?> addCustomer(@RequestBody Customer customer) {
		try {

			customerService.addCustomer(customer);

			return new ResponseEntity<Customer>(customer, HttpStatus.CREATED);

		} catch (CustomerException e) {
			return new ResponseEntity<String>(e.toString(), HttpStatus.NOT_ACCEPTABLE);
		}

	}

	@PostMapping(value = "/{customerId}/{firstName}")
	public ResponseEntity<?> updateCustomer(@PathVariable Integer customerId, @PathVariable String firstName)
			throws CloneNotSupportedException {
		try {

			Customer customer = customerService.updateCustomer(customerId, firstName);

			return new ResponseEntity<Customer>(customer, HttpStatus.CREATED);

		} catch (CustomerException e) {
			return new ResponseEntity<String>(e.toString(), HttpStatus.NOT_ACCEPTABLE);
		}

	}

	@GetMapping(value = "/{customerId}")
	public ResponseEntity<?> viewCustomer(@PathVariable Integer customerId) {
		try {

			Customer customer = customerService.viewCustomer(customerId);

			return new ResponseEntity<Customer>(customer, HttpStatus.CREATED);

		} catch (CustomerException e) {
			return new ResponseEntity<String>(e.toString(), HttpStatus.NOT_ACCEPTABLE);
		}

	}

}
