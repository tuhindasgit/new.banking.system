/**
 * 
 */
package com.banking.customer.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.banking.customer.entity.Customer;

/**
 * @author ritverma
 *
 */
public interface CustomerRepo extends JpaRepository<Customer, Integer> {

	Optional<Customer> findById(Integer customerId);
}
