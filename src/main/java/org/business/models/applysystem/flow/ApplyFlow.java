package org.business.models.applysystem.flow;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Data
public class ApplyFlow {

	private static final long serialVersionUID = 1L;
    
	public static String STEP_CREATE = "1";
	public static String STEP_PEND_ACCEPT = "2";
	public static String STEP_ACCEPTTED = "3";
	public static String STEP_PEND_APPROVE = "4";
	public static String STEP_APPROVED = "5";
	public static String STEP_PEND_REVIEW = "6";
	public static String STEP_REVIEWED = "7";
	public static String STEP_COMPLETE = "8";
	public static String STEP_FAILURE = "9";
	
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
