package org.business.models.applysystem;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;

import org.business.models.applysystem.Dictionary.Category;
import org.business.models.applysystem.Dictionary.Status;

@Entity
@Data
public class Task  {

	@Column
	private String  content;
	@Column
	private Category category;
	@Column
	private Date generateDate;
	
	@Column
	private Date deadLine;
	@Column
	private long creatorID;
	
	@Column
	private long managerID;
	
	@Column
	private Status status;
	
	@Id
	private long id;

}
