package com.dl.day20exceptionhandling;

class JDBC {
	static {
		System.out.println("Static Block");
	}
}

public class Eg5 {
	public static void main(String[] args) {
		System.out.println("Before");
		try {
			Class.forName("com.dl.day20exceptionhandling.JDBC");
			
		} catch (ClassNotFoundException e) {
			System.out.println("Exception : " + e);
		}
	}

}
