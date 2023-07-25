package com.day4.dl.variables;

public class Eg4 {

	static void m1(String name, long contactNumber, String mail, int age) {
		System.out.println("UserName: " + name);
		System.out.println("UserContactNo: " + contactNumber);
		System.out.println("UserEmail:  " + mail);
		System.out.println("UserAge:  " + age);
	}

	static void m2(String country, long pinCode) {
		m1("Hansna", 7483501539l, "Hansna16@gmail.com", 2);
		System.out.println("UserCountry: " + "India");
		System.out.println("UserPinCode: " + 548798);
		System.out.println(" ");
		m1("Naveen", 9742629411l, "Naveen23@gmail.com", 32);
		System.out.println("UserCountry: " + "Canada");
		System.out.println("UserPinCode: " + 658221);
		System.out.println(" ");
	}

	public static void main(String[] args) {
		m2(null, 0);
	}//its a wrong method to call by wrong literals
}
