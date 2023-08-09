package day25_collections;

import java.util.ArrayList;

public class Eg6 {
	public static void main(String[] args) {
		ArrayList<Integer> arrayList = new ArrayList<>();
		arrayList.add(10);
		arrayList.add(20);
		arrayList.add(30);
		arrayList.add(40);
		arrayList.add(50);
		arrayList.add(60);
		arrayList.add(70);
		arrayList.add(80);
		arrayList.add(70);
		arrayList.add(100);
		arrayList.add(70);

		System.out.println(arrayList.indexOf(10));
		System.out.println(arrayList.indexOf(20));
		System.out.println(arrayList.indexOf(50));

		System.out.println(arrayList.indexOf(70));
		System.out.println(arrayList.lastIndexOf(70));

		arrayList.clear();
		System.out.println(arrayList);

		System.out.println(arrayList.isEmpty());
	}

}
