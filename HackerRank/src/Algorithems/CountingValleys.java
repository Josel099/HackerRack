package Algorithems;

import java.util.Scanner;

class ValleysNo{
	
	public static int valleys(int s, String p ) {
		
		int valleycount=0;
		int count =0;
		
		for(int i =0 ; i< p.length(); i++) {
			
			if(p.charAt(i) == 'D') {
				
				count=count-1;
			}
			else if(p.charAt(i) == 'U') {
				
				count=count+1;
				if(count==0) {
					valleycount+=1;
				}
			}
			
			
		}
		
		
		return valleycount;
		
	}
	
	
	
}
public class CountingValleys {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int s = sc.nextInt();
		String p = sc.next();
		sc.close();
		
		int result = ValleysNo.valleys(s,p);
		System.out.println(result);
		
		
	}

}
