package activities;

import java.util.HashMap;
import java.util.Map;

public class Activity11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Map<Integer, String> colors = new HashMap<>();
		
		colors.put(1, "Red");
		colors.put(2, "Black");
		colors.put(3, "White");
		colors.put(4, "Pink");
		colors.put(5, "Green");
		
		System.out.println("The respective key & value of MapSet are");
		
		for(int item:colors.keySet()) {
			
			System.out.println("Key is: "+item);
			
			System.out.println("Value is: "+colors.get(item));
			
			
		}
		
		colors.remove(4);
		
		System.out.println("Is green part of the mapset: "+colors.containsValue("Green"));

		System.out.println("Size of mapset is: "+colors.size());
	}

}
