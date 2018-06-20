/**
 * 
 */
package com.banking.customer.service;

import com.banking.customer.entity.Customer;

/**
 * @author ritverma
 *
 */

public interface CustomerService {

	Customer addCustomer(Customer customer);


	void deleteCustomer(Integer CustomerId);

	Customer updateCustomer(String firstName, String lastname, Integer customerId);

	Customer viewCustomer(Integer CustomerId);


	
	void deleteCustomer(Integer CustomerId);
	
	Customer updateCustomer(Integer customerId,String firstName) throws CloneNotSupportedException;
	
	Customer viewCustomer(Integer CustomerId);

	
	

}
