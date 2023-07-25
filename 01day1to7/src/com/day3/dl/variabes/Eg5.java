package com.day3.dl.variabes;

import java.time.LocalDate;

public class Eg5 {

	// By me

	static int empId = 101;
	static String empMail = "amulya71@gmail.com";
	static LocalDate empDob = LocalDate.now();
	String empName = "Amulya";
	double empSalary = 50000;

	void m1() {
		System.out.println("EmpName =" + empName);
	}

	void m2() {
		System.out.println("EmpId = " + empId);
	}

	void m3() {
		System.out.println("EmpMail = " + empMail);
	}

	static void m4() {
		Eg5 eg = new Eg5();
		eg.m1();
		eg.m2();
		System.out.println("EmpDob = " + empDob);
	}

	static void m5() {
		Eg5 egm5 = new Eg5();
		System.out.println("EmpSalary = " + egm5.empSalary);
		egm5.m3();
	}

	public static void main(String[] args) {
		System.out.println("EMPLOYEE DETAILS");
		m4();
		m5();
	}

}
