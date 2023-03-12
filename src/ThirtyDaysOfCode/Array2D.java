package ThirtyDaysOfCode;

import java.util.Scanner;

public class Array2D {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int [][] A=new int[6][6];
		int [] sumA =new int [16];
		
		for(int i=0;i<6;i++) {
			for(int j=0;j<6;j++) {
				A[i][j]=sc.nextInt();
			}
			
			
		}

		// hour glass starting :::!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
		int t=0;
		for ( int r=0;r<4;r++) {   // for row has 4 hour glass shape is possible 
		
		for(int q=0;q<4;q++) { //for side ways 4 hour glass shape in a row  // cloumn number changing  for different hour glass shapes.
		
			int sum=0; //  for(int i=q;i<q+3;i++) { // loop's  for finding the hour glass shape
			
			for(int i=r;i<r+3;i++) { 		// row number 
				
			  
			      for(int j=q;j<q+3;j++) {         // cloumn number
			    	 
			    	  if(i != r+1) {          // checking the current loop is in mid element  or not .
				  sum=sum+A[i][j];
				
		    	    } else {
						  sum = sum+A[i][q+1];         // for finding the mid element in an houre glass   
					    break;
		    	    }
			  }
			 
			
		}
			sumA[t]=sum;
			t++;
	}
		}
		
		int max = sumA[0]; // initialize max to the first element of the array
	    for (int i = 1; i < 16; i++) {
	        if (sumA[i] > max) {
	            max = sumA[i]; // update max if a larger element is found
	        }
	    }
	    

	System.out.println(max);
		
	}
		
		

	}


