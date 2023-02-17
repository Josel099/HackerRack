package Algorithems;

import java.util.Scanner;

public class SumOfarry {

	
	public static void main(String[] args) {
		
		
		double[] arr = new double[1000];
		
		Scanner sc=new Scanner(System.in);
		double sum=0;
		System.out.println("enter the size of array");
		 int n=sc.nextInt();
		 System.out.println("enter the elements of of array");
		 for(int i=0;i<n;i++) {
			 arr[i]= sc.nextDouble();
			  sum=sum+arr[i];
		 }
		 sc.close();
		 System.out.println("The sum of the array is :" + sum);
		 
	
	
}
}