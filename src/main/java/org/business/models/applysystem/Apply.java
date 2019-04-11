package org.business.models.applysystem;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

import com.fasterxml.jackson.annotation.JsonIgnore;
	
@Entity
@Table
@Data
public class Apply implements Serializable {

    private static final long serialVersionUID = 1L;
    
    
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;
    
    @Column(unique=true)
    private String number;
    
    @Column(unique=true)
    private String name;
    
    @Column
    private String type;

    @Column
    private String area;

    @Column
    private String city;

    @Column
    private String province;

    @Column
    private String country;

    @JsonIgnore
    @Column
    private String createBy;
    
    @JsonIgnore
    @Column
    private String createTime;
    
    @JsonIgnore
    @Column
    private String updateBy;
     
    @JsonIgnore
    @Column
    private String updateTime;
    
    @JsonIgnore
    @Column
    private Long userID;

    @Column
    private String image;

    @JsonIgnore
    @Column
    private String ip;
    
    @JsonIgnore
    @Column
    private String deleted;
    
}
