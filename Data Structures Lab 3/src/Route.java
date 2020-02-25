//Richney Chin-Chap & Isabella MacMahon

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Route {
	public static ArrayList<Station> stations = new ArrayList<Station>();

	public Route() throws FileNotFoundException {

		Scanner s = new Scanner(new File("orange.txt"));
		
		while (s.hasNext()) {
			stations.add(new Station(s.nextLine()));
		}
		for (int i = 0; i < stations.size(); i++) {
			stations.get(i).setPassengers(assignPassengers());
		}
	}

	private LinkedQueue<Passenger> assignPassengers() {
		Random random = new Random();
		int num = random.nextInt(11);
		Passenger p;
		LinkedQueue<Passenger> que = new LinkedQueue<Passenger>();
		for (int i = 0; i < num; i++) {
			p = new Passenger(randDestination());
			que.enqueue(p);
		}
		return que;
	}

	private Station randDestination() {
		Random r = new Random();
		int num = r.nextInt(17);
		return stations.get(num);
	}
	
	public String toString() {
		String s = "";
		for (int i = 0; i < stations.size(); i++) {
			s += stations.get(i).toString();
		}
		return s;
		
	}

	public static void main(String[] args) throws FileNotFoundException {
		Route r = new Route();
		System.out.println(r.toString());
	}
}
