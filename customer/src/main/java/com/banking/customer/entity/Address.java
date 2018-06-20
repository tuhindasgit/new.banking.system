package com.banking.customer.entity;

import javax.persistence.Column;

import javax.persistence.Entity;


import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import org.springframework.data.mongodb.core.mapping.Document;

/**

 * @author 

 *
 */
@Document
public class Address {

	@Id

	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "Address_Id")

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
	 * @param id
	 *            the id to set

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
	 * @param street
	 *            the street to set

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
	 * @param zipCode
	 *            the zipCode to set

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
	 * @param city
	 *            the city to set

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

	public Address( String street, String zipCode, String city) {
		super();
	
	public Address( String street, String zipCode, String city) {
	


		this.street = street;
		this.zipCode = zipCode;
		this.city = city;
	}


	@Override
	public String toString() {
		return "Address [id=" + id + ", street=" + street + ", zipCode=" + zipCode + ", city=" + city + "]";
	}

}
