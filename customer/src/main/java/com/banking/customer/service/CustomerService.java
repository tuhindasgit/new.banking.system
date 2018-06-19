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

}
