package activities;

import java.util.Arrays;

public class Activity4 {

	public static void main(String[] args) {
		
		
		int values[] = {4,3,2,10,12,1,5,6};
		
		System.out.println("Values before sorting: "+Arrays.toString(values));
		
		sort(values);
		
		System.out.println("Values after sorting: "+Arrays.toString(values));
		

	}
	
	
	
	
	public static void sort(int array[])
	{
		
		int len= array.length;
		
		for(int i=1;i<len;i++) {
			
			int val=array[i];
			int j=i-1;
			 while(j>=0 && val<array[j]) {
				 
				 array[j+1] = array[j];
				 --j;
				 
			 }
			
			 array[j+1] = val;
			 
			
			
		}
		
			
	}	
		
	}


