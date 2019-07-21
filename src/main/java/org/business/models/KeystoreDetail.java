package org.business.models;

import lombok.Data;

@Data
public class KeystoreDetail {

	private String keystore;
	private String storePassword;
	private String storeType;
	private String keyAlias;
	private String keyPassword;
	private String firstAndLastName;
	private String organizationalUnit;
	private String organization;
	private String city;
	private String province;
	private String twoLetterCountryCode;
	private String signatureAlgorithm;
	private String keyAlgorithm;
	
}
