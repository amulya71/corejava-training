package day18final;

//If a method declared as final we cannot override it 

public class Eg2 {
	public void m1() {
		System.out.println("M1 Method");
	}

	public final void m2() {
		System.out.println("M2 Method");
	}

	public static void main(String[] args) {
		new Eg2().m1();
		new Eg2().m2();
	}

}
