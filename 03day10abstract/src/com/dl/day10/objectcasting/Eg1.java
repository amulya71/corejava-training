package com.dl.day10.objectcasting;

class Big {
	void m1() {
		System.out.println("M1 method of class Big");
	}
}

class Small extends Big {
	void m2() {
		System.out.println("M2 method of class Small");
	}
}

public class Eg1 {
	public static void main(String[] args) {
		// normal class
		Big big = new Big();
		big.m1();

		// inheritance
		Small small = new Small();
		small.m1();
		small.m2();

		// polymorphism
		Big big2 = new Small();
		big2.m1();

		// object casting
		// Small small2 = (Small)new Big();

		// object casting
		Big big3 = new Small();
		Small small3 = (Small) big3;
		small3.m1();
		small3.m2();
	}

}
