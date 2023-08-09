package com.dl.day20exceptionhandling;

public class Eg13 {
	public static void main(String[] args) throws Exception {
		getUserName("Admins");
	}

	public static void getUserName(String name) throws Exception {
		if (name == "Admin") {
			System.out.println("User Name is " + name);
		} else {
			throw new Exception("User Name is not validated");

		}
	}

}
