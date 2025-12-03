package activities;

public class Activity1 {

	public static void main(String[] args) {
		
		
		//Car Car1 = new Car("Black", "Manual", 2014, 4, 5);
		
		Car Car1 = new Car();
		Car1.Transmission = "Manual";
		Car1.Color = "Black";
		Car1.Make = 2014;
		Car1.displayCharacteristics();
		
		Car1.accelerate();
		
		Car1.brake();
		
		

	}

}
