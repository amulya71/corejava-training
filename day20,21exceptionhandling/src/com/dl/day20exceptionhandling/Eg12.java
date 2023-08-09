package com.dl.day20exceptionhandling;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class Eg12 {

	static File f = null;
	static FileInputStream f2 = null;

	public static void main(String[] args) throws IOException {
		try {
			System.out.println("Logic");
		} catch (Exception e) {
			System.out.println("Errors");
		}
		try {
			System.out.println("Logic");
		} finally {
			System.out.println("Closing Resources");
		}
		try {
			f = new File("one.txt");
			f2 = new FileInputStream(f);
			byte[] b = f2.readAllBytes();
			for (byte c : b) {
				System.out.println((char) c);
			}
		} catch (Exception e) {
			System.out.println(e);
		} finally {
			f2.close();
		}
	}
}
