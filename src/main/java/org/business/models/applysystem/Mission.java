package org.business.models.applysystem;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import org.apache.solr.client.solrj.beans.Field;

@Entity
@Table
public class Mission implements Serializable {
	private static final long serialVersionUID = 1L;
	private int id, valid, crmUserId;
	private String name, category, visibleScope ;
	private Date deadline ;

	@org.springframework.data.annotation.Id
	@Field
	@SequenceGenerator(name = "MISSION_ID_SEQ", allocationSize = 1)
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "MISSION_ID_SEQ")
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Column
	public int getValid() {
		return valid;
	}

	public void setValid(int valid) {
		this.valid = valid;
	}
	
	@Column
	public int getCrmUserId() {
		return crmUserId;
	}

	public void setCrmUserId(int crmUserId) {
		this.crmUserId = crmUserId;
	}

	@Column
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Column
	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	@Column
	public Date getDeadline() {
		return deadline;
	}

	public void setDeadline(Date deadline) {
		this.deadline = deadline;
	}

	@Column
	public String getVisibleScope() {
		return visibleScope;
	}
	
	
	public void setVisibleScope(String visibleScope) {
		this.visibleScope = visibleScope;
	}

}
