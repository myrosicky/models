package org.business.models.applysystem;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.Data;

@Entity
@Data
public class Quota implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;
	
	@Column
	private String month;

	@Column
	private Integer amount;

	@Column
	private String year;

	@JsonIgnore
	@Column
	private String deleted;
	
	@JsonIgnore
    @Column
    private Long createBy;
    
    @JsonIgnore
    @Column
    private String createTime;
    

}
