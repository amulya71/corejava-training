package com.dl.day13.enums;

public class Profile {
	String firstName;
	String lastName;
	String email;
	long contactNO;

	/*
	 * public Profile(String firstName, String lastName, String email, long
	 * contactNO) { this.firstName = firstName; this.lastName = lastName; this.email
	 * = email; this.contactNO = contactNO; }
	 */

	public void dispaly() {
		System.out.println(firstName);
		System.out.println(lastName);
		System.out.println(email);
		System.out.println(contactNO);
	}

	// this keyword refers to the current class instance variable
	public static void main(String[] args) {
		Profile profile = new Profile("Hansna", "kriiti", "Hansnakriiti@gmail.com", 9876543210l);
		profile.dispaly();
	}

	//args are different 

	public Profile(String fName, String lName, String mail, long cNO) {

		firstName = fName;
		lastName = lName;
		email = mail;
		contactNO = cNO;

	//public Profile(String firstName, String lastName, String email, long contactNO){
		firstName = firstName;
		lastName = lastName;
		email = email;
		contactNO = contactNO;

	}
}