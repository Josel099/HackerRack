package otherProblems;

import java.util.Scanner;

public class String1 {

	public static void main(String[] args) {
	
		
		Scanner sc = new Scanner(System.in);
		int T=sc.nextInt();
		
		for(int i=0;i<T;i++) {
			String s = sc.next();
			
			for(int j=0;j<s.length();) {
				
				char ch = s.charAt(j); 
				System.out.print(ch); 
				j=j+2;
			}
			System.out.print(" ");
			for(int j=1;j<s.length();) {
				
				char ch = s.charAt(j); 
				System.out.print(ch); 
				j=j+2;
			}
			System.out.println("");
		}
	}

}
