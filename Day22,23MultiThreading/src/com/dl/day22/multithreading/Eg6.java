package com.dl.day22.multithreading;
//Set and Get Priority

public class Eg6 extends Thread {
	public static void main(String[] args) {
		Eg6 eg1 = new Eg6();
		Eg6 eg2 = new Eg6();
		Eg6 eg3 = new Eg6();

		System.out.println(eg1.getPriority());
		System.out.println(eg2.getPriority());
		System.out.println(eg3.getPriority());

		eg1.setPriority(7);
		eg2.setPriority(6);
		eg3.setPriority(9);

		System.out.println(eg1.getPriority());
		System.out.println(eg2.getPriority());
		System.out.println(eg3.getPriority());

		eg1.setPriority(MAX_PRIORITY); // 10
		eg2.setPriority(MIN_PRIORITY); // 1
		eg3.setPriority(NORM_PRIORITY); // 5

		System.out.println(eg1.getPriority()); // 10
		System.out.println(eg2.getPriority()); // 1
		System.out.println(eg3.getPriority()); // 5
	}

}
