package com.sfdatabase.demo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Entity
@Getter
@Setter
@Table(name = "customerdetails")
@NoArgsConstructor
@JsonIgnoreProperties({"hibernateToLazyInitializer","handler"})
public class CustomerDetails {
	
	@Id
	@Column(name="applicationid",nullable=false)
	@SequenceGenerator(name = "customer_seq", sequenceName = "applicationid")
	@GeneratedValue(strategy= GenerationType.SEQUENCE,generator = "customer_seq")
	private Long applicationid;
	private String firstname;
	private String middlename;
	private String lastname;
	public Long getApplicationid() {
		return applicationid;
	}
	public void setApplicationid(Long applicationid) {
		this.applicationid = applicationid;
	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getMiddlename() {
		return middlename;
	}
	public void setMiddlename(String middlename) {
		this.middlename = middlename;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	
}
