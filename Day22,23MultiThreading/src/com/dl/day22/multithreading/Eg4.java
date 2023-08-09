package com.dl.day22.multithreading;
//Implementing runnable interface

public class Eg4 implements Runnable{
	public static void main(String[] args) {
		Eg4 eg4 = new Eg4();
		Thread t1 = new Thread(eg4);
		t1.start();
		Thread t2 = new Thread(eg4);
		t2.start();
		Thread t3 = new Thread(eg4);
		t3.start();
	}
	@Override
	public void run() {
		System.out.println("Run Method");
	}
	

}
