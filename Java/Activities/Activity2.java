package activities;

import java.util.Arrays;

public class Activity2 {

	public static void main(String[] args) {
		int Values[] = {10,15,17,55,10,-33,10};
		
		System.out.println("The values of array are: "+ Arrays.toString(Values));
	
		
		
		
		System.out.println("Result is "+result(Values, 10, 30));
		

		
	}
	
	
	
	
	public static boolean result(int[] Value, int fixednum, int fixedsum) {
		int sum=0;
		for(int i:Value) {
			if(i==fixednum) {
			sum=sum+fixednum;
			}
		}
		
		System.out.println("sum of 10's in the array is "+sum);
		
	    return sum==fixedsum;
			 
		
		
	}
	
	

}


