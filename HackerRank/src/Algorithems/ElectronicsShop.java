package Algorithems;

import java.util.Scanner;

  class expensive{
	
	  int getMoneySpent(int b , int[] keyboard, int[] usb,int n , int m) {
		
		 int demo;
		 int result= -1 ;
		 
		 for(int i=0 ; i< n;i++) {
			 
			 
			 for(int j=0;j<m;j++) {
				 
				 demo=keyboard[i]+usb[j];
				 
				 if( demo>result && demo<=b) {
					 result=demo;
				 }
				 
			 }
			 
		 }
			 
		 
		 
		 
		 
		 
		 return result;
	 }
	
}

public class ElectronicsShop {
	
	

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int b = sc.nextInt();
		int n = sc.nextInt();
		int m = sc.nextInt();
		
		int[] keyboard=new int[n];
		int[] usb = new int[m];
		
		for(int i=0 ; i<n ; i++) {
			keyboard[i]=sc.nextInt();
		}
		for(int i=0 ; i<m ; i++) {
			usb[i]=sc.nextInt();
		}
		expensive result=new expensive();
		
		System.out.println(result.getMoneySpent(b, keyboard, usb,n,m));
		
		
		

	}

}
