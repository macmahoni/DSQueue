//Richney Chin-Chap & Isabella MacMahon

import java.util.Random;

public class Passenger {

	private String id;
	private Station destination;

	public Passenger(Station dest) {
		id = randID();
		destination = dest;
	}

	public String randID() {

		Random random = new Random();
		int num = random.nextInt(100000);
		String formattedId = String.format("%05d", num);
		return formattedId;
	}
	
	public String toString() {
		String s = id + ", " + destination.getName() + "\n";
		return s;
	}

	public static void main(String[] args) {
		Passenger p = new Passenger(null);
		System.out.println(p.randID());
	}
}
