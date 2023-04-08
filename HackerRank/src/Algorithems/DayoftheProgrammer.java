package Algorithems;

import java.util.Scanner;


class Result{
	public static String programmerDay(int year) {
		
		String date;
		
		if(year <1918 ) {  //julian calender 
			
			if(year % 4 == 0) { //checking leap yr or not 
				
				date = "12.09."+year;
				
			}
			else 
			{
				
				date = "13.09."+year;
				
			}
			
			
		}
		else if ( year > 1918 ) { // Gregorian calendar 
			
				if(year%400 == 0 || (year%4 == 0 && year%100 != 0 )) { //checking leap yr or not 
				
					date = "12.09."+year;
				}
				else {
					
					date = "13.09."+year;
				}
		
		}else 
			
		{
			
			date = "26.09.1918";
			
			
		}
		
		
		
		
		
		
		
		return date;
		
	}
	
}


public class DayoftheProgrammer {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int year = sc.nextInt();
		
		System.out.println(Result.programmerDay( year));
		
	}

}
