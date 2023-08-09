package day24seatsavailable;

public class seatsAvaiable {
	int seats = 3;

	public synchronized void bookMovieTickets(String uname, int totalseats) throws InterruptedException {
		if (seats >= totalseats && totalseats > 0) {
			System.out.println("Hello" + uname + "you have booked" + totalseats + "Tickets");
			seats = seats - totalseats;
			System.out.println("Tickets Left : " + seats);
			Thread.sleep(3000);
		} else {
			System.out.println("Hello" + uname + "seats not available");

		}
	}

}
