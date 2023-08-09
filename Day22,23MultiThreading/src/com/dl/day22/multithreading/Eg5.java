package com.dl.day22.multithreading;
//Creating Custom Thread Name

public class Eg5 extends Thread {
	public static void main(String[] args) {
		Eg5 eg1 = new Eg5();
		System.out.println(eg1.getName());

		Eg5 eg2 = new Eg5();
		System.out.println(eg2.getName());

		Eg5 eg3 = new Eg5();
		System.out.println(eg3.getName());

		Thread.currentThread().setName("My New Thread 01");
		System.out.println(Thread.currentThread().getName());

		Thread.currentThread().setName("My New Thread 02");
		System.out.println(Thread.currentThread().getName());

	}

}
