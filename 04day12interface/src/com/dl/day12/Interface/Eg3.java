package com.dl.day12.Interface;

interface clienttwo {
	public static final int x = 10;
	int y = 20;
}

public class Eg3 implements clienttwo {
	public static void main(String[] args) {
		System.out.println(clienttwo.x);
		System.out.println(clienttwo.y);

		System.out.println(x);
		System.out.println(y);
	}

}
