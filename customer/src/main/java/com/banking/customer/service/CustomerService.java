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
	
	Customer updateCustomer(Customer customer);
	
	Customer viewCustomer(Integer CustomerId);

	
	
}
