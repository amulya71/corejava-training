package notifyandwait;

public class B {
	public static void main(String[] args) throws InterruptedException {
		A a = new A();
		System.out.println("01 Object A Ref: " + a);

		Thread t = new Thread(a);
		t.start();
		System.out.println("02 Start Method");

		synchronized (a) {
			System.out.println("03 synchronized Block Of Class B");
			a.wait();
			for (int i = 1; i < 5; i++) {
				System.out.println(i + "Loop inside synchronized Method");
			}
		}
	}

}
