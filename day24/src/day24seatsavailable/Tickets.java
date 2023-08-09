package day24seatsavailable;

public class Tickets extends Thread{
	seatsAvaiable seatsAvailable;
	String userName;
	int noOfSeats;
	
	public Tickets(seatsAvaiable seatsAvailable, String userName, int noOfSeats ) {
		this.seatsAvailable = seatsAvailable;
		this.userName = userName;
		this.noOfSeats = noOfSeats;
	}
	@Override
	public void run() {
		try {
			seatsAvailable.bookMovieTickets(userName,noOfSeats);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
