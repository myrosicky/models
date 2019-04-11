package org.business.models;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.NamedAttributeNode;
import javax.persistence.NamedEntityGraph;

import lombok.Data;
import lombok.ToString;

@Entity
@Data
@NamedEntityGraph(name = "menuRole.fetchRole", attributeNodes = {@NamedAttributeNode("role")})
@NamedEntityGraph(name = "menuRole.fetchUser", attributeNodes = {@NamedAttributeNode("user")})
@NamedEntityGraph(name = "menuRole.fetchMenu", attributeNodes = {@NamedAttributeNode("menu")})
public class MenuRole {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column
	private Long menuId;
	
	@Column
	private Long roleId;
	
	@Column
	private Long userId;
	
	@Column
	private String createTime;
	
	@Column
	private Long createBy;
	
	@Column
	private String deleted;
	
	@ToString.Exclude
	@ManyToMany(fetch=FetchType.LAZY)
	@JoinColumn(name="id", insertable=false, updatable=false)
    private List<User> user;
    
	@ToString.Exclude
	@ManyToMany(fetch=FetchType.LAZY)
	@JoinColumn(name="id", insertable=false, updatable=false)
    private List<Role> role;
    
	@ToString.Exclude
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="id", insertable=false, updatable=false)
    private Menu menu;
    
	
}
