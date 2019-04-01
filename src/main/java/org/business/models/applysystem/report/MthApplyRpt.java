package org.business.models.applysystem.report;

import lombok.Data;

@Data
public class MthApplyRpt implements java.io.Serializable {

	private static final long serialVersionUID = 1L;
	
	private String month;
	private short total;
	private short apply;
	private short pendApprove;
	private short approved;
	private short pendReview;
	private short reviewed;
	private short completed;
	private short fail;
	private short returnBack;
	
}
