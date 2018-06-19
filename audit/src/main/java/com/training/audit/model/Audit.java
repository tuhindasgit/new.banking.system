/**
 * 
 */
package com.training.audit.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import com.banking.customer.entity.Customer;

/**
 * @author tuhindas
 *
 */

public class Audit {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int auditId;
	private Customer oldCustomer;
	private Customer newCustomer;

	/**
	 * 
	 */
	public Audit() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param oldCustomer
	 * @param newCustomer
	 */
	public Audit(Customer oldCustomer, Customer newCustomer) {
		super();
		this.oldCustomer = oldCustomer;
		this.newCustomer = newCustomer;
	}

	public Customer getOldCustomer() {
		return oldCustomer;
	}

	public void setOldCustomer(Customer oldCustomer) {
		this.oldCustomer = oldCustomer;
	}

	public Customer getNewCustomer() {
		return newCustomer;
	}

	public void setNewCustomer(Customer newCustomer) {
		this.newCustomer = newCustomer;
	}
}
