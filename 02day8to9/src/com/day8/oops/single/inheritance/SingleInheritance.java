package com.day8.oops.single.inheritance;

public class SingleInheritance {
	public static void main(String[] args) {

		Child child = new Child();
		child.m2(); // child
		child.m1(); // parent
		System.out.println("I'm from < SingleInheritance > class ");

	}

}