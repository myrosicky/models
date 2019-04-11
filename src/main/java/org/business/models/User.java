package org.business.models;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;

	
/**
 * the persistence class of Buser Table
 * 
 * @author 
 * 
 */

@Entity
@Data
public class User {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long  id;
	
	@Column(unique = true, nullable = false, length = 20)
	private String username;
	
	@Column(nullable = false, length = 100)
	private String password;
	
	@Column(length = 40)
	private String general_ip;
	
	@Column
	private String remark;
	
	@Column
	private String category;
	
	@Column
	private String registerDate;
	
	@Column
	private String loginLastTime;
	
	@Column
	private String deleted;
	

}
