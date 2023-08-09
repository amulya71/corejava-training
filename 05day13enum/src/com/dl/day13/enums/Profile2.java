package com.dl.day13.enums;

public class Profile2 {

	private static final String FIRST_NAME = "Reuben";
	private static final String LAST_NAME = "Kumar";
	private static final String EMAIL_ID = "rk@gmail.com";
	private static final long PHONE_NUMBER = 7896523014L;

	public void print(String aa, String bb, String cc, long dd) {
		System.out.println(aa);
		System.out.println(bb);
		System.out.println(cc);
		System.out.println(dd);
	}

	public static void main(String[] args) {
		
		Profile2 p = new Profile2();
		p.print(FIRST_NAME, LAST_NAME, EMAIL_ID, PHONE_NUMBER);
	}

}
