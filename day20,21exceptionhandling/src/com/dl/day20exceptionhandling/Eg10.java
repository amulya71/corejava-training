package com.dl.day20exceptionhandling;

public class Eg10 {
	public static void main(String[] args) {
		try {

			int a = 10;
			int b = 2;
			int c = 0;

			System.out.println(a / b);
			System.out.println(a / c); // java.lang.ArithmeticException

			int aa[] = { 10, 20, 30, 40, 50 };

			System.out.println(aa[0]);
			System.out.println(aa[2]);
			System.out.println(aa[5]); // java.lang.ArrayIndexOutOfBoundsException

			String s1 = null;
			System.out.println(s1);
			System.out.println(s1.length()); // java.lang.NullPointerException

			String s2 = "Ten";
			int parseInt = Integer.parseInt(s2);
			System.out.println(parseInt); // java.lang.NumberFormatException

		} catch (ArithmeticException e) {
			System.out.println("Exception: " + e);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Exception: " + e);
		} catch (NullPointerException e) {
			System.out.println("Exception: " + e);
		} catch (NumberFormatException e) {
			System.out.println("Exception: " + e);
		}
	}

}
