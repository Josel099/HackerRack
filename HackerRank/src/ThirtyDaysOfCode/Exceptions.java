package ThirtyDaysOfCode;


import java.util.Scanner;

public class  Exceptions {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		
		String s = sc.nextLine();
		try {

			int i = Integer.parseInt(s);
			System.out.println(i);
		}
		catch(NumberFormatException e){
			
			System.out.println("Bad String");
		}
		
		
		
	}}
