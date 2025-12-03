package activities;

public class Activity3 {

	public static void main(String[] args) {
		
		double seconds = 1000000000;
		double years;
		double Earthsec = 31557600;
		
		double MercurySec = 0.2408467 * 31557600;
		double VenusSec = 0.61519726 * 31557600;
		double MarsSec = 1.8808158  * 31557600;
		double JupiterSec = 11.862615  * 31557600;
		double Saturnsec = 29.447498  * 31557600;
		double UranusSec = 84.016846  * 31557600 ;
		double NeptunrSec = 164.79132 * 31557600;
		
		//double PlanetsSec =[MercurySec,VenusSec,Earthsec, MarsSec, JupiterSec, Saturnsec, UranusSec, NeptunrSec]
		
		
		
		years= seconds/Earthsec;
		
		System.out.println("Age of the person on Earth is "+years+ " years");
		System.out.println("Age of the person on Mercury is "+seconds/MercurySec+ " years");
		System.out.println("Age of the person on Venus is "+seconds/VenusSec+ " years");
		System.out.println("Age of the person on Mars is "+seconds/MarsSec+ " years");
		System.out.println("Age of the person on Jupiter is "+seconds/JupiterSec+ " years");
		System.out.println("Age of the person on Saturn is "+seconds/Saturnsec+ " years");
		System.out.println("Age of the person on Uranus is "+seconds/UranusSec+ " years");
		System.out.println("Age of the person on Neptune is "+seconds/NeptunrSec+ " years");
		
		

	}

}
