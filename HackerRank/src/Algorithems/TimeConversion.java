package Algorithems;

import java.text.ParseException;
//import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class TimeConversion {

	public static void Time(String s){
		
		SimpleDateFormat twelvehourFormat = new SimpleDateFormat("hh:mm:ssa");
		Date date = null ;
		
		try {
			 date = twelvehourFormat.parse(s);
			
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		SimpleDateFormat twentyfourHour= new SimpleDateFormat("HH:mm:ss");
		//String n=twentyfourHour.format(date);
		
		System.out.println(twentyfourHour.format(date));
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String s =sc.next();
		Time(s);
		sc.close();
	}
}
