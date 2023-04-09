package Algorithems;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

 class Birds {
	
	public static int lowfrequency(List<Integer> birdType ) {
	
		
		int  birdid = Integer.MAX_VALUE;
		int maxFrequency = 0 ; 
		int [] frequencyArray = new int[6];
		
		
			for( int i : birdType) {
				
				frequencyArray[i]++;
				
			}
			
			for(int i =0 ; i< 6 ;i++ ) {
				
				if(maxFrequency < frequencyArray[i]) {
					
					maxFrequency = frequencyArray[i];
					
					birdid = i;
					
				}
				else if (maxFrequency == frequencyArray[i] && i < birdid) {
					
					maxFrequency = frequencyArray[i];
					
					birdid = i;
				}
			}
			
		
		
		
		return birdid;
		
	}
}

public class MigratoryBirds {

	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		ArrayList<Integer> birdType = new ArrayList<>(n);
		
		for(int i=0 ; i<n ; i++) {
			
			int temp = sc.nextInt();
			birdType.add(temp);
		}
		System.out.println(Birds.lowfrequency(birdType));
		
	}
}
