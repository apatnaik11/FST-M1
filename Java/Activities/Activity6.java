package activities;


import java.util.ArrayList;
import java.util.Date;
import java.util.List;


public class Activity6 {

	public static void main(String[] args) throws InterruptedException {
		
		Plane plane = new Plane(10);
		plane.onboard("Diksha");
		plane.onboard("Neha");
		plane.onboard("Nitish");
		
        System.out.println("Take off time is "+plane.takeoff());
        
        System.out.println("List of passengers are " +plane.getPAssengers());
        
        Thread.sleep(5000);
        
        System.out.println("Landing time is "+plane.land());
        
       

	}

}


class Plane{
	
	private int maxpassengers;
	private List<String> Passengers;
	private Date takeoff;
	private Date landing;
	
	public Plane(int maxpassengers){
		this.maxpassengers = maxpassengers;
		this.Passengers = new ArrayList<>();
	}
	
	public void onboard(String passengername) {
		if(Passengers.size()<=maxpassengers) {
		Passengers.add(passengername);
		}
		else 
			System.out.println("Plane is FULL");
	}
	
	public Date takeoff() {
		
		this.takeoff = new Date();
		return takeoff;
	}
	
	public Date land() {
		
		this.landing = new Date();
		return landing;
	}
	
	public List<String> getPAssengers() {
		
		return Passengers;
	}
	
	
	
	
	
}