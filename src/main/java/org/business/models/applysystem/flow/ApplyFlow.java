package org.business.models.applysystem.flow;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;

@Entity
@Data
public class ApplyFlow implements Flow{
    
	@Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;
	
	@Column(nullable=false)
    private long applyID;
	
	@Column(nullable=false)
	private String step;
	
	@Column(nullable=false)
	private String time;
	
	

}
