package day25_collections;

import java.util.ArrayList;

public class Eg1 {
	public static void main(String[] args) {
		ArrayList<Integer> arrayList = new ArrayList<>();

		// add elements
		arrayList.add(10);
		arrayList.add(20);
		arrayList.add(30);
		arrayList.add(40);
		arrayList.add(50);
		arrayList.add(60);
		System.out.println(arrayList); // [10, 20, 30, 40, 50, 60]

		// add(index , element)
		arrayList.add(0, 100);
		System.out.println(arrayList); // [100, 10, 20, 30, 40, 50, 60]
		arrayList.add(0, 1000);
		System.out.println(arrayList); // [1000, 100, 10, 20, 30, 40, 50, 60]

		System.out.println(arrayList.size()); // 8

		arrayList.add(8, 80);
		System.out.println(arrayList); // [1000, 100, 10, 20, 30, 40, 50, 60, 80]

		System.out.println(arrayList.size()); // 9

	}

}
