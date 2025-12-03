package activities;

public class Car {
	
	String Color;
	String Transmission;
	int Make;
	int Tyres;
	int Doors;
	
	
	public Car(){
		
		//Tyres=4;
		//Doors=4;
	}
	
	/*
	public Car(String Color, String Transmission, int Make, int Tyres, int Doors) {
		
		this.Color = Color;
		this.Transmission = Transmission;
		this.Make = Make;
		this.Tyres = Tyres;
		this.Doors = Doors;
		
	}
	*/
	
	public void displayCharacteristics() {
		System.out.println("Values are:");
	    System.out.println(Color);
	    System.out.println(Transmission);
	    System.out.println(Make);
	    System.out.println(Tyres);
	    System.out.println(Doors);
	    		
	}
	
	public void accelerate() {
		System.out.println("Car is moving forward");
		
	}
	
	public void brake() {
		System.out.println("Car has stopped");
	}
	
	
	
	
}
