/**
 * 
 */
package com.banking.customer.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.banking.customer.entity.Address;

/**
 * @author ritverma
 *
 */
public interface AddressRepo extends JpaRepository<Address, Integer>{

}
