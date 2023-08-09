package day25_collections;

import java.util.ArrayList;
import java.util.List;

public class Eg4 {
	public static void main(String[] args) {
		List<Object> arrayList = new ArrayList<>();
		arrayList.add(10);
		arrayList.add(20);
		arrayList.add(30);
		arrayList.add(40);
		arrayList.add(50);

		System.out.println(arrayList);
		System.out.println(arrayList.get(0));
		System.out.println(arrayList.get(2));
		System.out.println(arrayList.get(4));

	}

}
