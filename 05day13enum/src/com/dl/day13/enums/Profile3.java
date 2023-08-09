package com.dl.day13.enums;

public class Profile3 {

	//---- Constants----
	private static final String FIRST_NAME = "Reuben";
	private static final String LAST_NAME = "Kumar";
	private static final String EMAIL_ID = "rk@gmail.com";
	private static final long PHONE_NUMBER = 7896523014L;

	// ------- Variables-------
	String firstName;
	String lastName;
	String email;
	long contactNO;
	
	// ------- Constructor-------	
	public Profile3(String firstName, String lastName, String email, long contactNO) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.contactNO = contactNO;
	}

	public void print() {
		System.out.println(firstName);
		System.out.println(lastName);
		System.out.println(email);
		System.out.println(contactNO);
	}

	public static void main(String[] args) {

		Profile3 p = new Profile3(FIRST_NAME, LAST_NAME, EMAIL_ID, PHONE_NUMBER);
		p.print();
		
	}

}
