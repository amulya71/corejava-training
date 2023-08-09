package day25_collections;

import java.util.ArrayList;
import java.util.List;

public class Eg5 {
	public static void main(String[] args) {
		List<Object> arrayList = new ArrayList<>();
		arrayList.add(10);
		arrayList.add(20);
		arrayList.add(30);
		arrayList.add(40);
		arrayList.add(50);
		System.out.println(arrayList);

		System.out.println(arrayList.remove(2));
		System.out.println(arrayList);
		System.out.println(arrayList.remove(3));
		System.out.println(arrayList);
	}

}
