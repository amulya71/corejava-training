package notifyandwait;

public class A implements Runnable {

	@Override
	public void run() {
		System.out.println("04 Run Method Of Class A");

		synchronized (this) {
			System.out.println(" 05 synchronized Block Of Class A");

			for (int i = 1; i < 5; i++) {
				System.out.println(i + "06 Loop inside Run Method and synchronized Method");
			}
			notify();
		}
	}

}
