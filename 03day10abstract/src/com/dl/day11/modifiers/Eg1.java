package com.dl.day11.modifiers;

public class Eg1 {
	private static String userName = "Sai Kiran";
	private static String password = "admin1234";
	static String email = "SaiKiran@gmail.com";
	public static String address = "Hyd";
	protected static long contactNo = 9876543210l;

	public static void main(String[] args) {
		// Modifiers
		// private : same class
		// default : same package
		// protected : other packages but inheritance is required
		// public : any package

		System.out.println(userName);
		System.out.println(password);
		System.out.println(address);
	}

}
