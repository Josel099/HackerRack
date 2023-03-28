package Algorithems;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SubarrayDivision {
	
	static class Result{
		
		 public  int birthday(List<Integer> choclate, int d, int m) {
			
			
			int count =0;
			for (int i=0;i<=choclate.size()-m;i++) {
				int  sum = 0 ;
				for(int j=i; j<i+m ;j++ ) {
					
					sum = sum +	choclate.get(j);
				}
				
				if ( sum == d) {
					count ++;
				}

			}
			 
			 
			 return count;
			   
			    }

	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		int n = sc.nextInt();
		
		List<Integer> choclate= new ArrayList<>(n);
		
		for (int i=0 ; i< n ; i++) {
			int item = sc.nextInt();
			choclate.add(item);
		}
		
		int d = sc.nextInt();
		int m = sc.nextInt();

		Result rc = new Result();
		int result = rc.birthday(choclate, d, m);
		System.out.println(result);
		
	}

}
