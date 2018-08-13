package org.business.models.applysystem;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.fasterxml.jackson.annotation.JsonIgnore;
	
@Entity
public class Apply implements Serializable {

    private static final long serialVersionUID = 1L;
    
    private final static String TYPE_INDIVIDUAL = "0";
    private final static String TYPE_CORPORATION = "1";
    private final static String TYPE_OTHER = "2";

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Integer id;
    
    @Column(unique=true)
    private String number;
    
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
    private Date createTime;
    
    @Column
    private Integer userID;

    @Column
    private String image;

    @JsonIgnore
    @Column
    private String ip;
    
    
    public Apply(){}
    
	public String getIp() {
		return ip;
	}
	public Apply setIp(String ip) {
		this.ip = ip;
		return this;
	}
	public Integer getId() {
		return id;
	}
	public Apply setId(Integer id) {
		this.id = id;
		return this;
	}
	public String getNumber() {
		return number;
	}
	public Apply setNumber(String number) {
		this.number = number;
		return this;
	}
	public String getType() {
		return type;
	}
	public Apply setType(String type) {
		this.type = type;
		return this;
	}
	public String getArea() {
		return area;
	}
	public Apply setArea(String area) {
		this.area = area;
		return this;
	}
	public String getCity() {
		return city;
	}
	public Apply setCity(String city) {
		this.city = city;
		return this;
	}
	public String getProvince() {
		return province;
	}
	public Apply setProvince(String province) {
		this.province = province;
		return this;
	}
	public String getCountry() {
		return country;
	}
	public Apply setCountry(String country) {
		this.country = country;
		return this;
	}
	public Integer getUserID() {
		return userID;
	}
	public Apply setUserID(Integer userID) {
		this.userID = userID;
		return this;
	}
	public String getImage() {
		return image;
	}
	public Apply setImage(String image) {
		this.image = image;
		return this;
	}

	public String getCreateBy() {
		return createBy;
	}

	public Apply setCreateBy(String createBy) {
		this.createBy = createBy;
		return this;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public Apply setCreateTime(Date createTime) {
		this.createTime = createTime;
		return this;
	}

	
    

}
