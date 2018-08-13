package org.business.models.applysystem;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;

import org.business.models.applysystem.Dictionary.Category;
import org.business.models.applysystem.Dictionary.Status;

@Entity
public class Task implements Serializable {

	private static final long serialVersionUID = 1L;

	private String  content;
	private Category category;
	private Date generateDate, deadLine;
	private long creatorID, managerID;
	private Status status;
	
	@Id
	private long id;

	public Task(Category category, String content, Date deadLine, long userID) {
		super();
		this.category = category;
		this.content = content;
		this.deadLine = deadLine;
		this.generateDate = new Date();
		this.creatorID = userID;
		this.managerID = userID;
	}

	
	
	public Status getStatus() {
		return status;
	}



	public void setStatus(Status status) {
		this.status = status;
	}



	public Category getCategory() {
		return category;
	}

	public Date getGenerateDate() {
		return generateDate;
	}

	public Date getDeadLine() {
		return deadLine;
	}

	public long getCreatorID() {
		return creatorID;
	}

	public void setCategory(Category category) {
		if (category != null)
			this.category = category;
	}

	public void setGenerateDate(Date generateDate) {
		if (generateDate != null)
			this.generateDate = generateDate;
	}

	public void setDeadLine(Date deadLine) {
		if (deadLine != null)
			this.deadLine = deadLine;
	}

	public void setCreatorID(long creatorID) {
		this.creatorID = creatorID;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		if (content != null)
			this.content = content;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public long getManagerID() {
		return managerID;
	}

	public void setManagerID(long managerID) {
		this.managerID = managerID;
	}

}
