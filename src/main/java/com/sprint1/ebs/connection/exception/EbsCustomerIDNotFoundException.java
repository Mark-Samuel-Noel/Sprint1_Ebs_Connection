package com.sprint1.ebs.connection.exception;

public class EbsCustomerIDNotFoundException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public EbsCustomerIDNotFoundException() {
		super();
	}

	public EbsCustomerIDNotFoundException(String message, Throwable cause, boolean enableSuppression,
			boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}	
}