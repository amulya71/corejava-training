package com.dl.day14thiskeyword;

class A{
	int a = 10;
	int b = 20;
}
class B extends A{
	int a = 100;
	int b = 200;
	
	public void display() {
		System.out.println(this.a);
		System.out.println(this.b);
		
		System.out.println(super.a);
		System.out.println(super.b);
	}
}
public class Eg1 {
	public static void main(String[] args) {
		new B().display();
	}
}
