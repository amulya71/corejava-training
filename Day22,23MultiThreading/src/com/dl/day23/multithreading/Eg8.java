package com.dl.day23.multithreading;

import java.util.Iterator;

class A {
	public synchronized void m1() {
		for (int i = 0; i < 5; i++) {
			System.out.println(i + " " + Thread.currentThread().getName());
			try {
				Thread.sleep(2000);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}

class B extends Thread {
	A a;

	public B(A a) {
		this.a = a;
	}

	public void un() {
		a.m1();
	}
}

class C extends Thread {
	A a;

	public C(A a) {
		this.a = a;
	}

	public void run() {
		a.m1();
	}

}

class D extends Thread {
	A a;

	public D(A a) {
		this.a = a;
	}

	public void run() {
		a.m1();
	}

}

public class Eg8 {
	public static void main(String[] args) {
		A a = new A();
		B b = new B(a);
		C c = new C(a);
		D d = new D(a);

		b.start();
		c.start();
		d.start();
	}

}
