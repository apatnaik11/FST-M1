package activities;


interface Bicycle_Parts{
	
	public int tyres = 2;
	public int maxSpeed = 25;
	
}

interface Bicycle_Operations{
	
	public void applyBrake(int decrement);
	public void sppedUp(int increment);
	
}

class BiCycle implements Bicycle_Parts, Bicycle_Operations{

	public int gears;
	public int CurrentSpeed;
	
	public BiCycle(int gears, int currentSpeed) {
		
		this.gears = gears;
		this.CurrentSpeed = currentSpeed;
	}
	
	
	@Override
	public void applyBrake(int decrement) {
		CurrentSpeed = CurrentSpeed - decrement;
		System.out.println("Current speed is "+CurrentSpeed);
		
	}

	@Override
	public void sppedUp(int increment) {
		CurrentSpeed = CurrentSpeed + increment;
		System.out.println("Current speed is "+CurrentSpeed);
		
	}
	
	public String bicycleDesc() {
        return("No of gears are "+ gears + "\nSpeed of bicycle is " + maxSpeed);
    }
		
	
}

class Mountain_Bike extends BiCycle{

	int seatHeight;
	
	public Mountain_Bike(int gears, int currentSpeed, int seatHeight) {
		super(gears, currentSpeed);
		this.seatHeight = seatHeight;
	}
	
	public void setHeight(int newHeight) {
		
		seatHeight = newHeight;
		
	}
	
	public String bicycleDesc() {
		return("No of gears are "+super.gears+ "\nSpeed of bicycle is "+super.maxSpeed+"\nSeat Height is "+seatHeight);
	}
	
	
}




public class Activity7 {

	public static void main(String[] args) {
		
		Mountain_Bike MB = new Mountain_Bike(4, 10, 3);
		System.out.println(MB.bicycleDesc());
		
		MB.sppedUp(10);
		MB.setHeight(5);
		System.out.println(MB.bicycleDesc());
		
		

	}

}
