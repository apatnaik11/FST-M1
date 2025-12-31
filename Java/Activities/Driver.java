package activities;

public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MountainBike mb = new MountainBike(4,15,2);
		System.out.println(mb.bicycleDesc());
		mb.applybrake(10);
		mb.speedup(20);
		
		//calling bicycle's desc method
		
		System.out.println(mb.parentbicycledesc());
		
		
		
		

	}

}


interface BicycleParts{
	
	public int tyres =2;
	public int maxspeed=80;
	
}

interface BicycleOperations{
	
	public void applybrake(int decrement);
	public void speedup(int increment);
	
	
}

class Bicycle implements BicycleParts, BicycleOperations{
	
	public int gears;
	public int currentspeed;
	
	Bicycle(int gears, int currentspeed){
		this.gears = gears;
		this.currentspeed = currentspeed;
		
	}
	
	public void applybrake(int decrement) {
		
		currentspeed = currentspeed - decrement;
		System.out.println("After applying brake, current speed: "+currentspeed);
		
		
	}
	
	public void speedup(int increment) {
		
		currentspeed = currentspeed +increment;
		System.out.println("After applying brake, current speed: "+currentspeed);
		
	}
	
	public String bicycleDesc() {
		
		return("Number of gears: "+gears+" & max speed of cycle: "+maxspeed);
		
	}
	
	
	
}


class MountainBike extends Bicycle{

	public int seatheight;
	
	MountainBike(int gears, int currentspeed, int seatheight) {
		super(gears, currentspeed);
		this.seatheight = seatheight;
		
	}
	
	
	public void setheight(int height) {
		
	seatheight = height;
	}
	
	
    public String bicycleDesc() {
		return("No of Gears: "+super.gears+" & no of max speed of cycle: "+super.currentspeed+" & height: "+this.seatheight);
	}
    
    public String parentbicycledesc() {
    	 return super.bicycleDesc();
    	
    }
	
	
}