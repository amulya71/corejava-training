package com.dl.day22.multithreading;

public class Eg1 {
	// main method/main thread
	public static void main(String[] args) {
		// thread is build-in-class this class contains properties and methods
		Thread thread = Thread.currentThread();
		System.out.println(thread); // Thread(main , 5, main)
		System.out.println(thread.getName()); // main
		System.out.println(thread.getClass()); // class java.lang.thread
		System.out.println(thread.getState()); // RUNNABLE
	}

}
