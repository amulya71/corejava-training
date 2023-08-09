package com.dl.day17.string;

public class Eg2 {
	//using literal
	
	public static void main(String[] args) {
		// equals() method: content comparision

		String s1 = "Java";
		String s2 = "Python";
		System.out.println(s1.equals(s2));
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());

		String s3 = "Java";
		System.out.println(s1.equals(s3));
		System.out.println(s3.hashCode());

		// Heap Area
		// SCP Area (String Constant pool)
		// "Java"----s1---s3
		// "Python"---s2

		// Reference Comparision
		System.out.println(s1 == s2);
		System.out.println(s1 == s3);
	}

}
