package com.bae.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="babysitter_details")
public class Babysitters implements Serializable {
	 private static final long serialVersionUID = 1L;
	@Id
	private int babysitter_id;
	private String first_name;
	private String last_name;
	private String location;
	private String email_id;
	private String mobile_number;
	private String password;
	private int rating;

	public int getRating() {
		return rating;
	}


	public void setRating(int rating) {
		this.rating = rating;
	}


	public int getBabysitter_id() {
		return babysitter_id;
	}


	public void setBabysitter_id(int babysitter_id) {
		this.babysitter_id = babysitter_id;
	}


	public String getFirst_name() {
		return first_name;
	}


	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}


	public String getLast_name() {
		return last_name;
	}


	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}

	public String getLocation() {
		return location;
	}


	public void setLocation(String location) {
		this.location = location;
	}


	public String getEmail_id() {
		return email_id;
	}


	public void setEmail_id(String email_id) {
		this.email_id = email_id;
	}


	public String getMobile_number() {
		return mobile_number;
	}


	public void setMobile_number(String mobile_number) {
		this.mobile_number = mobile_number;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	@Override
	public String toString() {
		return  email_id+ password ;
	}
	                  
	

}
