package com.banking.customer.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import org.springframework.core.env.Environment;
import org.springframework.stereotype.Service;

import com.banking.customer.entity.Customer;
import com.banking.customer.exception.CustomerException;
import com.banking.customer.repository.CustomerRepo;


@Service

import com.training.audit.Model.Audit;

@Service
@Configuration
@PropertySource("message.properties")

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


	@Override
	public Customer addCustomer(Customer customer) {

		if (customer.getFirstName() == null || customer.getLastName() == null) {
			throw new CustomerException(environment.getProperty("Provide_valid_info"));

		} else {
			customerRepo.save(customer);
		}

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
	public Customer updateCustomer(String firstName,String lastName,Integer customerId) {
		// TODO Auto-generated method stub
		Optional<Customer> custOpt=customerRepo.findById(customerId);
		if(custOpt.isPresent())
		{
			Customer cust=custOpt.get();
			cust.setFirstName(firstName);
			cust.setLastName(lastName);
		return  cust;
		}
		else
		{
			throw new CustomerException(environment.getProperty("Id_Doesnt_Exist"));
		}
		Optional<Customer> customerChk = customerRepo.findById(CustomerId);
		if (customerChk.isPresent()) {
			customerRepo.delete(CustomerId);
		} else {
			throw new CustomerException(environment.getProperty("Customer_Not_Found"));
		}
	}

	@Override
	public Customer updateCustomer(Integer customerId, String firstName) throws CloneNotSupportedException {
		Optional<Customer> customerChk = customerRepo.findById(customerId);
		if (customerChk.isPresent()) {
			Audit audit = new Audit();
			Customer newCustomer = customerChk.get();
			Customer oldCustomer = newCustomer.clone();
			audit.setOldCustomer(oldCustomer);
			newCustomer.setFirstName(firstName);
			audit.setNewCustomer(newCustomer);			
			customerRepo.save(newCustomer);
			return newCustomer;

		} else {
			throw new CustomerException(environment.getProperty("Customer_Not_Found"));
		}


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
	

		Optional<Customer> customerChk = customerRepo.findById(CustomerId);
		if (customerChk.isPresent()) {
			return customerChk.get();
		} else {
			throw new CustomerException(environment.getProperty("Customer_Not_Found"));
		}
	}


}
