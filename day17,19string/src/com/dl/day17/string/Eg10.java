package com.dl.day17.string;

public class Eg10 {
	public static void main(String[] args) {
		// String is immutable
		String s1 = new String("Hello Java");
		System.out.println(s1);
		System.out.println(s1.concat("Hello Python"));
		System.out.println(s1);
		System.out.println();

		// String Buffer is mutable(synchroized)
		StringBuffer sb = new StringBuffer("Hello Java");
		System.out.println(sb);
		sb.append("Hello Python");
		System.out.println(sb);
		System.out.println();

		// StringBuilder is mutable(not synchroized)
		StringBuilder sb1 = new StringBuilder("Hello Java");
		System.out.println(sb1);
		sb1.append("Hello Python");
		System.out.println(sb1);

	}

}
