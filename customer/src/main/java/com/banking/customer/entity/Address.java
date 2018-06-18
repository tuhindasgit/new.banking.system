package com.banking.customer.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * @author 
 *
 */
@Entity
public class Address {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="Address_Id")
	private Integer id;
	private String street;
	private String zipCode;
	private String city;
	/**
	 * @return the id
	 */
	public Integer getId() {
		return id;
	}
	/**
	 * 
	 */
	public Address() {
		super();
	}
	/**
	 * @param id the id to set
	 */
	public void setId(Integer id) {
		this.id = id;
	}
	/**
	 * @return the street
	 */
	public String getStreet() {
		return street;
	}
	/**
	 * @param street the street to set
	 */
	public void setStreet(String street) {
		this.street = street;
	}
	/**
	 * @return the zipCode
	 */
	public String getZipCode() {
		return zipCode;
	}
	/**
	 * @param zipCode the zipCode to set
	 */
	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}
	/**
	 * @return the city
	 */
	public String getCity() {
		return city;
	}
	/**
	 * @param city the city to set
	 */
	public void setCity(String city) {
		this.city = city;
	}
	/**
	 * @param id
	 * @param street
	 * @param zipCode
	 * @param city
	 */
	public Address(Integer id, String street, String zipCode, String city) {
		super();
		this.id = id;
		this.street = street;
		this.zipCode = zipCode;
		this.city = city;
	}
}
