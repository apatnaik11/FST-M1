package activities;

import java.util.ArrayList;

public class Activity9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<String> myList = new ArrayList<String>();
		myList.add("Akku");
		myList.add("Anu");
		myList.add("Harshu");
		myList.add("Navya");
		myList.add("Sailu");
		
		System.out.println("Items in the array:");
		for(String Item:myList) {
			System.out.println(Item);
		}
		
		System.out.println("3rd item is"+myList.get(2));
		
		System.out.println("Is Sailu present in the list:"+myList.contains("Sailu"));
		
		System.out.println("Size of array is"+myList.size());
		
		myList.set(4, "Sri");
		
		System.out.println(myList);
		
		myList.remove("Akku");
		
		System.out.println(myList);
			
		

	}

}
