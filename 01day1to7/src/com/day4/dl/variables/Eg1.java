package com.day4.dl.variables;

public class Eg1 {

	String name1 = "Hansna Kriiti";
	String name2 = "Reuben";

	long userContactNo1 = 7483501539L;
	long userContactNo2 = 9742629411L;

	String userEmail1 = "Hansna@gmail.com";
	String userEmail2 = "Reuben@gmail.com";

	String UserAddress1 = "Hyd";
	String UserAddress2 = "Hyd";

	String BankName1 = "ICICI";
	String BankName2 = "HDFC";

	String BankAddress1 = "Madhapur";
	String BankAddress2 = "Hitech city";

	public static void main(String[] args) {
		Eg1 eg1 = new Eg1();
		System.out.println("UserName: " + eg1.name1);
		System.out.println("UserContact: " + eg1.userContactNo1);
		System.out.println("UserEmail:  " + eg1.userEmail1);
		System.out.println("UserAddress: " + eg1.UserAddress1);
		System.out.println("BankName: " + eg1.BankName1);
		System.out.println("BankAddress: " + eg1.BankAddress1);

		System.out.println("");

		System.out.println("UserName: " + eg1.name2);
		System.out.println("UserContact: " + eg1.userContactNo2);
		System.out.println("UserEmail: " + eg1.userEmail2);
		System.out.println("UserAddress: " + eg1.UserAddress2);
		System.out.println("BankName: " + eg1.BankName2);
		System.out.println("BankAddress: " + eg1.BankAddress2);

	}
}
