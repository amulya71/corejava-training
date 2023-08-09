package day24seatsavailable;

public class Client {
	public static void main(String[] args) {
		seatsAvaiable Available = new seatsAvaiable();
		Tickets t1 = new Tickets(Available ,"sai kiran" , 2);
		Tickets t2 = new Tickets(Available , "sai ram", 2);
		
		t1.start();
		t2.start();

	}

}
