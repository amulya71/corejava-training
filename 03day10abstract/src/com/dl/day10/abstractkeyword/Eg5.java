package com.dl.day10.abstractkeyword;

class AAAA {
	public void m1() {
		System.out.println("m1 method");
	}
}

abstract class BBBB extends AAAA {
	public abstract void m2();

	public void m3() {
		System.out.println("m3 method");
	}
}

class CCC extends BBBB {
	@Override
	public void m2() {
		System.out.println("m2 method");
	}

}

public class Eg5 {

}
