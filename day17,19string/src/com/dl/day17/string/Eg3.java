package com.dl.day17.string;

public class Eg3 {
	//using new keyword
	
	public static void main(String[] args) {
		// equals() method: content comparision

				String s1 = new String( "Java" );
				String s2 = new String ("Python");
				System.out.println(s1.equals(s2));
				System.out.println(s1.hashCode());
				System.out.println(s2.hashCode());

				String s3 = new String ("Java");
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


