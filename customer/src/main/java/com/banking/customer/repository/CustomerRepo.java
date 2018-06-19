/**
 * 
 */
package com.banking.customer.repository;

import java.util.Optional;
import org.springframework.data.mongodb.repository.MongoRepository;
import com.banking.customer.entity.Customer;

/**
 * @author ritverma
 *
 */
public interface CustomerRepo extends MongoRepository<Customer, Integer> {

	Optional<Customer> findById(Integer customerId);
}
