package com.sprint1.ebs.connection.exception;

public class EbsConnectionIDNotFoundException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public EbsConnectionIDNotFoundException() {
		super();
	}

	public EbsConnectionIDNotFoundException(String message, Throwable cause, boolean enableSuppression,
			boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}
}