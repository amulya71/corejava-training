package com.day8.inheritance;

public class Techinicalskills extends Address {

	public int noOfCertifications;
	public String primarySkill;
	public String secondarySkill;
	public Address address; 

	//public Techinicalskills(int noOfCertifications,  String primarySkill,String secondarySkill,Address address) {
		
	
	
	public Techinicalskills(String address, int pincode, int noOfCertifications, String primarySkill,
			String secondarySkill, String address2) {
		super(address, pincode);
		this.noOfCertifications = noOfCertifications;
		this.primarySkill = primarySkill;
		this.secondarySkill = secondarySkill;
		address = address2;
	}

	public void display() {
		System.out.println(address);
		System.out.println(pincode);
		System.out.println(noOfCertifications);
		System.out.println(primarySkill);
		System.out.println(secondarySkill);
		System.out.println(address.address);
		System.out.println(" ");
	}
}
