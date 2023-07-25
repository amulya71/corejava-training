package com.dl.day12.Interface;

interface clientone {
	public abstract void m1();

	public abstract void m2();

	public abstract void m3();

	public abstract void m4();
}

class clientoneimp implements clientone {

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

}

public class Eg2 {
	public static void main(String[] args) {
		clientoneimp impl = new clientoneimp();
		impl.m1();
		impl.m2();
		impl.m3();
		impl.m4();

		clientone one = new clientoneimp();
		one.m1();
		one.m2();
		one.m3();
		one.m4();
	}

}
