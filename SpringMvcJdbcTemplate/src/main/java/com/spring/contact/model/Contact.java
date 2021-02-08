package com.spring.contact.model;

public class Contact {
	private int id;
	private String firstname;
	private String lastname;
	private String status;
	private String email;
	private String address;
	private String telephone;

	public Contact() {
	}

	public Contact(String firstname,String lastname,String status, String email, String address, String telephone) {
		this.firstname = firstname;
		this.lastname = lastname;
		this.status = status;
		this.email = email;
		this.address = address;
		this.telephone = telephone;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getTelephone() {
		return telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

}
