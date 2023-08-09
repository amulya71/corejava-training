package com.dl.day14thiskeyword;
class x {
	public void m1() {
		System.out.println("M1 Method");
	}
}
class y extends x{
	public void m2() {
		System.out.println("M2 Method");
	}
	public void m3() {
		super.m1();
		System.out.println("M3 Method");
		this.m2();
	}
}

public class Eg2 {
	public static void main(String[] args) {
		new y().m3();
	}

}
