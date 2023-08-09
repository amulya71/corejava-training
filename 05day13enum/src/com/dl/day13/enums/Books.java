package com.dl.day13.enums;

public enum Books {
	JAVABOOK, PYTHONBOOK, JAVASCRIPTBOOK;

	public static void main(String[] args) {
		Books[] values = Books.values();
		for (Books books : values) {
			System.out.println(books);
			System.out.println(books.ordinal());
		}

		Books valueof = Books.valueOf("PYTHONBOOK");
		System.out.println(valueof);
	}

}
