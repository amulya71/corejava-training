package day24synchronized;

public class B {
	public static void main(String[] args) {
		A a = new A();
		System.out.println("Object A ref : " + a);
		Thread t = new Thread(a);
		t.start();
		System.out.println("Start Method");

		synchronized (a) {
			System.out.println("synchronized Block Of Class B");

			for (int i = 1; i < 5; i++) {
				System.out.println(i + "Loop inside synchronized Block");
			}
		}
	}

}
