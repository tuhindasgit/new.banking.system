/**
 * 
 */
package com.banking.customer.exception;

/**
 * @author ritverma
 *
 */
public class CustomerException extends RuntimeException {

	private static final long serialVersionUID = 6960130156930538227L;
	String message;
	/**
	 * @param message
	 */
	public CustomerException(String message) {
		super();
		this.message=message;
		
	}


	@Override
	public String toString() {
		return  "message= " +message ;
	}

}
