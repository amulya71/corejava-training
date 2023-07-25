package com.day9.poly.methodoverloading;

public class Eg1 {
	
//polymorphism
//method overloading, method overriding,operator overloading and constructor overloading

//method overloading: method name must be same , arguments must be different
//method overloading needs only one class

	
	public void getGasPrice(float petrolprice , float dieselprice) {
		System.out.println(petrolprice);
		System.out.println(dieselprice);
	}
	public void getGasPrice(double petrolprice , double dieselprice) {
		System.out.println(petrolprice);
		System.out.println(dieselprice);
	}

public static void main(String[] args) {
	Eg1 eg1 = new Eg1();
	eg1.getGasPrice(80, 800);
	eg1.getGasPrice(90f, 90f);
}


}
