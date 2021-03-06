package com.employee.spring_boot_employee.Entity;

import java.util.List;
//import java.util.Date;
import java.util.Locale;

import com.employee.spring_boot_employee.domain.PrimaryAddress;


public class Emp {
	
	private long id;
	private String firstName;
	private String lastName;
	private List<PrimaryAddress> primaryAddress;
	private String secondaryAddress;
	private long phoneNumber;
	private Locale dob;
	private String bloodGroup;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	
	public List<PrimaryAddress> getPrimaryAddress() {
		return primaryAddress;
	}
	public void setPrimaryAddress(List<PrimaryAddress> primaryAddress) {
		this.primaryAddress = primaryAddress;
	}
	public String getSecondaryAddress() {
		return secondaryAddress;
	}
	public void setSecondaryAddress(String secondaryAddress) {
		this.secondaryAddress = secondaryAddress;
	}
	public long getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(long phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	
	public Locale getDob() {
		return dob;
	}
	public void setDob(Locale dob) {
		this.dob = dob;
	}
	public String getBloodGroup() {
		return bloodGroup;
	}
	public void setBloodGroup(String bloodGroup) {
		this.bloodGroup = bloodGroup;
	}
	
	
}
