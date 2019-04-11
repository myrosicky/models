package org.business.exceptions;

public class BusinessCheckingException extends AppException {

	private static final long serialVersionUID = 1L;

	public BusinessCheckingException(String errMsg) {
		super("98", errMsg);
	}

	
}
