package org.business.models;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;

@Entity
public class UserRole {

	private static final long serialVersionUID = 1L;

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
	
	@Column
	private Date createTime;
	
	@Column
	private String createBy;

	
	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	
	public String getCreateBy() {
		return createBy;
	}

	public void setCreateBy(String createBy) {
		this.createBy = createBy;
	}
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getRoleId() {
		return roleId;
	}

	public void setRoleId(Long roleId) {
		this.roleId = roleId;
	}

	public Integer getType() {
		return type;
	}

	public void setType(Integer type) {
		this.type = type;
	}

	public Role getRole() {
		return role;
	}

	protected void setRole(Role role) {
		this.role = role;
	}

	public Long getOwnerId() {
		return ownerId;
	}

	public void setOwnerId(Long ownerId) {
		this.ownerId = ownerId;
	}


	
}
