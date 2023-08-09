package com.dl.day23.multithreading;

class AA {
	public void m1() {
		for (int i = 0; i < 5; i++) {
			System.out.println(i + "Non synchronized Area Loop");
		}
		synchronized (this) {
			for (int i = 6; i < 10; i++) {
				System.out.println(i + " synchronized Area Loop");
			}
		}
		System.out.println("Non synchronized M1");
	}
}

public class Eg9 extends Thread {
	AA aa;

	public Eg9(AA aa) {
		this.aa = aa;
	}

	@Override
	public void run() {
		aa.m1();
	}

	public static void main(String[] args) {
		AA aa2 = new AA();
		Eg9 eg9 = new Eg9(aa2);
		eg9.start();
	}

}
