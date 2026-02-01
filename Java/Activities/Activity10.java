package activities;

import java.util.HashSet;

import com.sun.tools.javac.util.Assert;

public class Activity10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashSet<String> hs = new HashSet<String>();
		
		hs.add("Akku");
		hs.add("Anu");
		hs.add("Harshu");
		hs.add("Indu");
		hs.add("Cutu");
		hs.add("Vasu");
	
		System.out.println(hs);
		
		System.out.println("Size of hs is "+hs.size());
		
		hs.remove("Cutu");
		
		hs.remove("Sri");
		
		System.out.println("Is Akku present in the set: "+hs.contains("Akku"));
		
		System.out.println(hs);
		
		
		

	}

}
