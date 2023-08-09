package com.dl.day13.enums;

public class Student {
	
	public Student() {
		this(101);
		System.out.println("Default Constructor");
	}
	public Student(int id) {
		System.out.println("Constructor : " +id);
	}
		//this() constructor invoke current class constructor
	
	public static void main(String[] args) {
		new Student();
	}
}
