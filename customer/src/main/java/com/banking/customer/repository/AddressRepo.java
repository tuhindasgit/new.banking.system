/**
 * 
 */
package com.banking.customer.repository;


import org.springframework.data.jpa.repository.JpaRepository;


import org.springframework.data.mongodb.repository.MongoRepository;

import com.banking.customer.entity.Address;

/**
 * @author ritverma
 *
 */

public interface AddressRepo extends JpaRepository<Address, Integer> {

public interface AddressRepo extends MongoRepository<Address, Integer> {


}
