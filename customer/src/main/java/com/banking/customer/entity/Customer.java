
package com.banking.customer.entity;

import javax.persistence.CascadeType;

import javax.persistence.Entity;


import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;


import org.springframework.data.mongodb.core.mapping.Document;


/**
 * @author
 *
 */
@Document
public class Customer implements Cloneable {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	private String firstName;
	private String lastName;

	@OneToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
	@JoinColumn(name = "Address_Id", unique = true)
	Address address;

	/**
	 * 
	 */
	public Customer() {
		super();
	}

	/**
	 * @param id
	 * @param firstName
	 * @param lastName
	 * @param address
	 */

	public Customer( String firstName, String lastName, Address address) {
		super();

	public Customer(String firstName, String lastName, Address address) {
		super();

		this.firstName = firstName;
		this.lastName = lastName;
		this.address = address;
	}

	/**
	 * @return the id
	 */
	public Integer getId() {
		return id;
	}

	/**
	 * @param id
	 *            the id to set
	 */
	public void setId(Integer id) {
		this.id = id;
	}

	/**
	 * @return the firstName
	 */
	public String getFirstName() {
		return firstName;
	}

	/**
	 * @param firstName
	 *            the firstName to set
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	/**
	 * @return the lastName
	 */
	public String getLastName() {
		return lastName;
	}

	/**
	 * @param lastName
	 *            the lastName to set
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	/**
	 * @return the address
	 */
	public Address getAddress() {
		return address;
	}

	/**
	 * @param address
	 *            the address to set
	 */
	public void setAddress(Address address) {
		this.address = address;
	}


	// Required because while creating audit we need old and new customer so without
	// providing this method it does shallow cloning
	// so old and new customer object is the same.
	public Customer clone() throws CloneNotSupportedException {
		return (Customer) super.clone();
	}

}
