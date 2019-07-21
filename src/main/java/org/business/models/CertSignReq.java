package org.business.models;

import lombok.Data;

@Data
public class CertSignReq {

	private String keystore;
	private String storePassword;
	private String storeType;
	private String keyAlias;
	private String keyPassword;
	private String file;
	private String signatureAlgorithm;
	
	
}
