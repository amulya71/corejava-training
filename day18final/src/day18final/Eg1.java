package day18final;
//if a variable declared as final we cannot reassign it

public class Eg1 {
	final int x = 10;

	public static void main(String[] args) {
		int a = 10;
		final int b = 20;
		System.out.println(a);
		System.out.println(b);

		// The final local variable b cannot be assigned . it must be blank and not
		// using a compound value

		// b = 30;
		// System.out.println(b);

		System.out.println(Byte.MAX_VALUE);
		Eg1 eg1 = new Eg1();
		System.out.println(eg1.x);
		// eg1.x = 30; //the final field Eg1.x cannot be assigned

	}

}
