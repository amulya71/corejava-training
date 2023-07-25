package com.dl.day10.encapsulation;

public class Register {
	// Encapsulation
	// wrapping the data and their members into a single unit

	private int id;
	private String userName;
	private String email;
	private long contactNo;
	private String address;

	public int getId() {
		return id;
	}

	// setters and getters
	public void setId(int id) {
		this.id = id;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public long getContactNo() {
		return contactNo;
	}

	public void setContactNo(long contactNo) {
		this.contactNo = contactNo;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

}
