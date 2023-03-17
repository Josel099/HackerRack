package Algorithems;


import java.util.Scanner;

public class ArraysumLong {
	
	
	
	public static void main(String[] args) {
		
		Long[] ar=new Long[10];
		
		Scanner sc=new Scanner(System.in);
		
		//sc.useDelimiter(" ");
		int n =sc.nextInt();
		long sum=0;
		for(int i=0;i<n;i++) {
			
			ar[i]=sc.nextLong();
			// sc.useDelimiter(", ");
			sum=sum+ar[i];
		
		}
		sc.close();
		System.out.println(sum);
		
	}

}
























//In this challenge, you are required to calculate and print the sum of the elements in an array, keeping in mind that some of those integers may be quite large.
//
//Function Description
//
//Complete the aVeryBigSum function in the editor below. It must return the sum of all array elements.
//
//aVeryBigSum has the following parameter(s):
//
//int ar[n]: an array of integers .
//Return
//
//long: the sum of all array elements