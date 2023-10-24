package br.com.edtonlemos.model;

import javax.faces.bean.ManagedBean;

@ManagedBean
public class StudentOne {
	
	private String firstName;
	private String lastName;
	private String email;
	private String freePasses;
	private String postalCode;
	private String phoneNumber;
	
	public StudentOne() {
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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getFreePasses() {
		return freePasses;
	}

	public void setFreePasses(String freePasses) {
		this.freePasses = freePasses;
	}

	public String getPostalCode() {
		return postalCode;
	}

	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

}
