package Algorithems;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BreakingtheRecords {
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		int n = sc.nextInt();
		 List<Integer> scores = new ArrayList<>(n);
		 
		 for(int i=0; i<n ; i++) {
			 int scoresItem = sc.nextInt();
			 scores.add(scoresItem);
		 }
		 
		 
		 int maxcount = 0;
		 int mincount = 0;
		 
		 int maxvalue = scores.get(0);
		 int minvalue = scores.get(0);
		 
		 for(int i = 1; i< n ; i++) {
			
			 if (scores.get(i)<minvalue) {
				 mincount++;
				 minvalue = scores.get(i);
			 }
			 else if (scores.get(i)>maxvalue) {
			 maxcount++;
			 maxvalue = scores.get(i);
			 }
		 }
		 
		 System.out.println(maxcount +" "+ mincount);
		 
		 
		 
	}

}
