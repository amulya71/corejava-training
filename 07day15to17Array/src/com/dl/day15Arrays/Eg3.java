package com.dl.day15Arrays;

public class Eg3 {
	public static void main(String[] args) {
		// length variable
		int a[] = new int[5];
		a[0] = 10;
		System.out.println(a.length);
		System.out.println(a.length * 2);
		System.out.println(a.length - 1);

		int b[] = { 10, 20 };
		System.out.println(b.length);

		// int aa[] = new int[0];
		// aa[0] =10;
		// System.out.println(aa[0]);//java.lang.ArrayIndexOutOfBoundsException

		int aaa[] = new int[-4];
		aaa[-4] = -40;
		aaa[-3] = -30;
		System.out.println(aaa[-4]); // java.lang.NegativeArraySizeException
	}

}
