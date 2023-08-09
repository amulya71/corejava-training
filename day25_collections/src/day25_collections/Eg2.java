package day25_collections;

import java.util.ArrayList;

public class Eg2 {
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<>();
		list.add("NameZero");
		list.add("NameOne");
		list.add("NameTwo");
		list.add("NameThree");
		list.add("NameFour");
		list.add("NameFive");
		System.out.println(list);

		list.set(0, "Hansna Kriiti");
		System.out.println(list);
		list.set(2, "Naveen Kumar");

		System.out.println(list);
	}

}
