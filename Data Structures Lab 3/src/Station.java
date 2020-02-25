//Richney Chin-Chap & Isabella MacMahon
public class Station {
	private String name;
	@SuppressWarnings("rawtypes")
	private LinkedQueue <Passenger>passengers;
	
	public Station (String n) {	
		name = n;
	}
	
	public void setPassengers(LinkedQueue<Passenger> p) {
		passengers = p;
	}
	
	public String getName() {
		return name;
	}
	
	public String toString() {
		String s = name + "\n";
		s += "     Passengers: \n\n";
		LinkedQueue temp = passengers;
		for (int i = 0; i < temp.size(); i++) {
			s += temp.dequeue().toString();
		}
		s += "\n";
		return s;
		
	}
}