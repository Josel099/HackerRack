package ThirtyDaysOfCode;

import java.util.Scanner;

public class Factorial {
	

	
	 public static  int factorial(int n) {
		
	        if (n == 0) {
	          return 1;
	        } else {
	            return n * factorial(n - 1);
	        }
	    }
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int r=factorial(n);
		sc.close();
		System.out.println(r);
	}

}
//public static   void factorial(int n) {
//int r=1;
//int i=1;
//while(i <=n) {
// r=r*i;
//	i++;
//}
//System.out.println(r);
//
//}
