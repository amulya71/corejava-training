package com.dl.day12.Interface;

interface ClientSix {
	public abstract void m1();

	public abstract void m2();
}

interface ClientSixPlus {
	public abstract void m3();

	public abstract void m4();
}

interface ClientSixPro extends ClientSix, ClientSixPlus {
	public abstract void m5();
}

public class Eg6 implements ClientSixPro {
	public static void main(String[] args) {

		Eg6 eg6 = new Eg6();
		eg6.m1();
		eg6.m2();
		eg6.m3();
		eg6.m4();
		eg6.m5();

	}

	@Override
	public void m1() {
		System.out.println("M1 method");
	}

	@Override
	public void m2() {
		System.out.println("M2 method");
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
	public void m5() {
		System.out.println("M5 method");
	}

}
