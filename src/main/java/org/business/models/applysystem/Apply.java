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
    
    public final static String TYPE_INDIVIDUAL = "0";
    public final static String TYPE_CORPORATION = "1";
    public final static String TYPE_OTHER = "2";
    
    public final static String DELETED_FALSE = "0";
    public final static String DELETED_TRUE = "1";
    

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

    @Column
    private String createBy;
    
    @Column
    private String createTime;
    
    @Column
    private String updateBy;
     
    @Column
    private String updateTime;
    
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
