package com.dl.day12.Interface;

interface ClientFour {
	void m1();

	void m2();

	void m3();

	void m4();
}

abstract class ClientFourimpl implements ClientFour {
	public void m1() {

	}

}

abstract class ClientFourimplTwo implements ClientFour {
	public void m3() {
		System.out.println("M3 method - abstract");
	}

	public void m4() {
		System.out.println("M4 method - abstract");
	}
}

public class Eg5 implements ClientFour {

	public static void main(String[] args) {

	}

	@Override
	public void m3() {
		System.out.println("M3 method");
	}

	@Override
	public void m4() {
		System.out.println("M4 method");
	}

	@Override
	public void m1() {
		// TODO Auto-generated method stub

	}

	@Override
	public void m2() {
		// TODO Auto-generated method stub

	}
}
