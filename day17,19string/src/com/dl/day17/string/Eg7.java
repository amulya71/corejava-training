package com.dl.day17.string;

public class Eg7 {
	public static void main(String[] args) {
		String s1 = "Hello Java and Hello Python and Hello JavaScript";
		System.out.println(s1);
		String[] split = s1.split("and");
		for (String string : split) {
			System.out.println(string);
		}
		String s2 = "Hello Java # Hello Python # Hello JavaScript";
		System.out.println(s2);
		String[] split2 = s2.split("#");
		for (String string2 : split2) {
			System.out.println(string2);
			
			String join = String.join("#" ,"Hello Java" , "Hello Python", "Hello JavaScript");
			System.out.println(join);
			
		}
	}
}
