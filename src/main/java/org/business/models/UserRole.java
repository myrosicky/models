package org.business.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedAttributeNode;
import javax.persistence.NamedEntityGraph;

import lombok.Data;

@Entity
@Data
@NamedEntityGraph(name = "userRole.fetchUserAndRole", attributeNodes = {@NamedAttributeNode("role"), @NamedAttributeNode("user")})
public class UserRole {

	public final static int TYPE_MENU = 0;
	public final static int TYPE_GROUP = 1;
	public final static int TYPE_USER = 2;
					
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column
	private Long roleId;
	
	@Column
	private Long ownerId;
	
	@Column
	private Integer type;  
	
	@ManyToOne
	@JoinColumn(name="roleId", referencedColumnName="id", insertable = false, updatable = false)
	private Role role;
	
	@ManyToOne
	@JoinColumn(name="ownerId", referencedColumnName="id", insertable = false, updatable = false)
	private User user;
	
	@Column
	private String createTime;
	
	@Column
	private Long createBy;

	
}
