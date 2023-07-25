package com.dl.day10.abstractkeyword;

abstract class AA {
	public abstract void m1();

	public abstract void m2();

	public abstract void m3();

	public abstract void m4();
}

abstract class BB extends AA {
	@Override
	public void m1() {
		System.out.println("M1 method");
	}

	@Override
	public void m2() {
		System.out.println("M1 method");
	}
}

class CC extends BB {
	@Override
	public void m3() {
		System.out.println("M3 method");
	}

	@Override
	public void m4() {
		System.out.println("M4 method");
	}
}

public class Eg2 {
	public static void main(String[] args) {
		// when we use abstract class, i need only two abstract method implementation
		// out of four abstract
		CC cc = new CC();
		cc.m1();
		cc.m2();
		cc.m3();
		cc.m4();

	}

}
