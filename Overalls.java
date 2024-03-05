import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Overalls {

	private int numOvr;
	private int ovr;
	private Map<Integer, Overalls> overallObjects = new HashMap<>();
	private static ArrayList<Overalls> inventory = new ArrayList<Overalls>();
	
	Overalls(){
		this.numOvr = 0;
	}

	public static void main(String[] args) {
		
		// Create list of objects 
		for (int i = 0; i < 17; i++) {
			Overalls ovr = new Overalls();
			inventory.add(ovr);
		}
		// Assign overall values to each object
		int count = 83;
		for (int i = 0; i < inventory.size(); i++) {
			Overalls temp = inventory.get(i);
			temp.setOvr(count++); // Incrementing count to increase overall up to 99
			inventory.set(i, temp);
		}
		
		// Assign keys to each object
		int mapKeys = 83;
		for (int i = 0; i < inventory.size(); i++) {
			Overalls temp = inventory.get(i);
			// Use encapsulation to set map keys
			temp.setMapKey(temp.getOvr(), temp);
		}
		
		//TODO Fix getOvrObject and setMapKey so that when you call them on an object 
		// they set the map key for that specific object properly
		
	}
	
	public void setMapKey(Integer key, Overalls o) {
		overallObjects.put(key, o);
		//System.out.println(overallObjects.get(key));
	}
	
	
	
	public Overalls getOvrObject() {
		return overallObjects.get(this.ovr);
	}
	
	public int getNumOvr() {
		return numOvr;
	}
	public void setNumOvr(int numOvr) {
		this.numOvr = numOvr;
	}
	public int getOvr() {
		return ovr;
	}
	public void setOvr(int ovr) {
		this.ovr = ovr;
	}
	
}
