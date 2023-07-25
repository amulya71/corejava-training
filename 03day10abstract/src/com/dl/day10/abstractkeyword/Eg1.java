package com.dl.day10.abstractkeyword;

//abstract class contains abstract keyword
//abstract class contains abstract keyword and non abstract keyword
abstract class A {
	public abstract void m1();

	public abstract void m2();

	public void m3() {
		System.out.println("M3 method non abstract method");
	}
}

class B extends A {
	@Override
	public void m1() {
		System.out.println("M1 method is abstract method");
	}

	@Override
	public void m2() {
		System.out.println("M2 method is abstract method");
	}
}

public class Eg1 {
	public static void main(String[] args) {
		B b = new B();
		b.m1();
		b.m2();
		b.m3();
	}

}
