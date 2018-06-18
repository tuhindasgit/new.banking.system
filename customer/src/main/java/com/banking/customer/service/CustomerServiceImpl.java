package com.banking.customer.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Service;

import com.banking.customer.entity.Customer;
import com.banking.customer.exception.CustomerException;
import com.banking.customer.repository.CustomerRepo;

@Service
public class CustomerServiceImpl implements CustomerService {

	@Autowired
	CustomerRepo customerRepo;
	@Autowired
	Environment environment;
	
	@Override
	public Customer addCustomer(Customer customer) {
		System.out.println("in service");
		customerRepo.save(customer);
		System.out.println("exiting service");
		return customer;
	}

	@Override
	public void deleteCustomer(Integer CustomerId) {
		Optional<Customer> customerChk=customerRepo.findById(CustomerId);
		if(customerChk.isPresent())
		{
		customerRepo.delete(CustomerId);
		}
		else
		{
			throw new CustomerException(environment.getProperty("Customer_Not_Found"));
			}
	}
	@Override
	public Customer updateCustomer(Customer customer) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Customer viewCustomer(Integer CustomerId) {
		Optional<Customer> customerChk=customerRepo.findById(CustomerId);
		if(customerChk.isPresent())
		{
			
		return customerChk.get();
		}
		else
		{
			throw new CustomerException(environment.getProperty("Customer_Not_Found"));
			}
	}
	

}
