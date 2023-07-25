package com.day4.dl.variables;

public class Eg3 {

	static String name1 = "Hansna Kriiti";
	static long userContactNo1 = 7483501539L;
	static String userEmail1 = "Hansna@gmail.com";
	static String userAddress1 = "Hyd";
	static String bankName1 = "ICICI";
	static String bankAddress1 = "Madhapur";

	static String name2 = "Reuben";
	static long userContactNo2 = 9742629411L;
	static String userEmail2 = "Reuben@gmail.com";
	static String userAddress2 = "Hyd";
	static String bankName2 = "HDFC";
	static String bankAddress2 = "Hitech city";

	public static void m1() {
		// Eg3 eg1 = new Eg3();
		System.out.println("UserName: " + name1);
		System.out.println("UserContact: " + userContactNo1);
		System.out.println("UserEmail:  " + userEmail1);
		System.out.println("UserAddress: " + userAddress1);
		System.out.println("BankName: " + bankName1);
		System.out.println("BankAddress: " + bankAddress1);
	}

	public void m2() {
		// Eg3 eg2 = new Eg3();
		System.out.println("UserName: " + name2);
		System.out.println("UserContact: " + userContactNo2);
		System.out.println("UserEmail: " + userEmail2);
		System.out.println("UserAddress: " + userAddress2);
		System.out.println("BankName: " + bankName2);
		System.out.println("BankAddress: " + bankAddress2);
	}

	public static void main(String[] args) {
		Eg3 eg = new Eg3();
		m1();
		System.out.println("");
		eg.m2();
	}
}