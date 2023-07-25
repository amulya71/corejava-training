package com.day9.poly.methodoverriding;

public class Child extends parent{
	
	public void m1(int a, int b) {
		System.out.println("M1 method child");
	}
	public static void main(String[] args) {
		//single level inheritance
		Child child = new Child();
		child.m1(10, 20);
		
		//normal class
		parent p = new parent();
		p.m1(100, 200);
		
		//polymorphism
		parent pp = new Child();
		pp.m1(1000, 2000);
	}
}
