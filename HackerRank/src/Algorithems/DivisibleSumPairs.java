package Algorithems;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
class solution {
	
	
	public static int divisibleCount(int k ,List<Integer>ar) {
		
		int count = 0 ; 
		
		for(int i =0; i<ar.size()-1; i++) {
			
			for(int j= i+1; j< ar.size(); j++) {
				
				if ((ar.get(i)+ar.get(j)) % k == 0) {
					
					count++ ; 
				}
			  }
			}
		return count;	
	}
}

public class DivisibleSumPairs {
	


	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		
		ArrayList<Integer> ar = new ArrayList<Integer>(n);
		
		for (int i=0; i<n ; i++) {
			
			int temp = sc.nextInt();
			ar.add(temp);
		}
		
		
		int result = solution.divisibleCount(k,ar);
		System.out.println(result);
		
	}
	
}
