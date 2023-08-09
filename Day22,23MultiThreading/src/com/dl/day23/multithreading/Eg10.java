package com.dl.day23.multithreading;

public class Eg10 extends Thread {
	@Override
	public void run() {
		try {
			for (int i = 0; i < 5; i++) {
				System.out.println(i);
				Thread.sleep(2000);
			}
		} catch (Exception e) {
			System.out.println(e);
		}
	}

	public static void main(String[] args) throws InterruptedException {
		Eg10 a1 = new Eg10();
		a1.start();
		Thread.currentThread().getName();
		a1.join();

		Eg10 a2 = new Eg10();
		a2.start();
		Thread.currentThread().getName();
		a2.join();

		Eg10 a3 = new Eg10();
		a3.start();
		Thread.currentThread().getName();
		a3.join();
	}

}
