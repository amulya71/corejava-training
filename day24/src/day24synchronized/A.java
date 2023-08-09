package day24synchronized;

public class A implements Runnable {

	@Override
	public void run() {
		System.out.println("Run Method Of Class A");
		synchronized (this) {
			System.out.println("synchronized Block Of Class A");

			for (int i = 0; i < 5; i++) {
				System.out.println(i + "Loop inside Run Method and synchronized Method");
			}
		}
	}

}
