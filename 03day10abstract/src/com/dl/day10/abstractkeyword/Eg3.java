package com.dl.day10.abstractkeyword;

abstract class AAA {
	// instance creation is not possible for abstract class , instance method ,
	// instance variable , instance block

	int a = 10;
	static int b = 20;

	public void m1() {
		System.out.println(a);
		System.out.println(b);
	}
}

class BBB extends AAA {

}

public class Eg3 {
	public static void main(String[] args) {

		// new AAA();
		new BBB().m1();
	}
}
