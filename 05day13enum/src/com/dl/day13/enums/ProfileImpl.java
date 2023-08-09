package com.dl.day13.enums;

public class ProfileImpl {
	public void add() {
		update();  //this.update();
		System.out.println("ADD METHOD");
		this.delete();
	}
	public void update() {
		System.out.println("UPDATE METHOD");
	}
	public void delete() {
		System.out.println("DELETE METHOD");
	}
	//this keyword can be used to invoke current class method
	public static void main(String[] args) {
		ProfileImpl profileImpl = new ProfileImpl();
		profileImpl.add();
	}
}
