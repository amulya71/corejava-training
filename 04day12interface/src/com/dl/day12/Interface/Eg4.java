package com.dl.day12.Interface;

interface clientThree {
	public abstract void m1();

	public abstract void m2();
}

interface clientThreeplus {
	public abstract void m3();

	public abstract void m4();
}

public class Eg4 implements clientThree, clientThreeplus {
	public static void main(String[] args) {
		Eg4 eg4 = new Eg4();
		eg4.m1();
		eg4.m2();
		eg4.m3();
		eg4.m4();
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
		System.out.println("M1 method");
	}

	@Override
	public void m2() {
		System.out.println("M2 method");
	}

}
