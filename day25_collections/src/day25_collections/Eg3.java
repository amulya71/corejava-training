package day25_collections;

import java.util.ArrayList;
import java.util.List;

public class Eg3 {
	public static void main(String[] args) {
		ArrayList<Object> arrayList = new ArrayList<>();
		arrayList.add(10);
		arrayList.add(20);
		System.out.println(arrayList); // [10, 20]

		List<Object> list = new ArrayList<>();
		list.add(100);
		list.add(200);
		System.out.println(list); // [100, 200]

		System.out.println(list.addAll(arrayList)); // true
		System.out.println(list); // [100, 200, 10, 20]
	}

}
