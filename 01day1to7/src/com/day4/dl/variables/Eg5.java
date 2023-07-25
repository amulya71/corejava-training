package com.day4.dl.variables;

public class Eg5 {

	static void m1(String name, long contactNumber, String mail, int age) {
		System.out.println("UserName: " + name);
		System.out.println("UserContactNo: " + contactNumber);
		System.out.println("UserEmail:  " + mail);
		System.out.println("UserAge:  " + age);
	}

	static void m2(String country, long pinCode) { 
		m1("Hansna", 7483501539l, "Hansna16@gmail.com", 2);
		System.out.println("UserCountry: " + country);
		System.out.println("UserPinCode: " + pinCode);
		System.out.println();
		//m1("Naveen", 9742629411l, "Naveen23@gmail.com",32); -> Not possible 
	}

	public static void main(String[] args) {
		m2("India", 548798);
		m2("Canada", 658221);
	}
}
