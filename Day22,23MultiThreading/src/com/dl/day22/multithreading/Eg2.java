package com.dl.day22.multithreading;
//By extending thread

public class Eg2 extends Thread {
	public static void main(String[] args) {
		Eg2 eg2 = new Eg2();
		// to all run() method we need start()
		eg2.start();
	}

	// run() method overrides java.lang.Thread.run
	public void run() {
		System.out.println("Run Method");
	}

}
