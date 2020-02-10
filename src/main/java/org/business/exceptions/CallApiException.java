package org.business.exceptions;

public class CallApiException extends AppException {

	public CallApiException(String api) {
		super("-1", "fail to call api["+api+"]");
	}

}
