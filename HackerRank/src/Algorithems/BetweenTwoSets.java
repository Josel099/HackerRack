package Algorithems;

import java.util.Arrays;
import java.util.Scanner;

public class BetweenTwoSets {

	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int count=0;
		int n = sc.nextInt();
		int m = sc.nextInt();
		int [] a = new int [n];
		int [] b = new int [m];
		
		for(int i=0; i<n;i++) {
			a[i]=sc.nextInt();	
		}

		for(int i=0; i<m;i++) {
			b[i]=sc.nextInt();
			
		}
	
		// finding maximum value and minvalue of array 1 & 2
		int minvalue =100;
		int maxvalue =0;
		
		for(int i=0;i<n;i++) {
			if (minvalue > a[i]) {
				minvalue = a[i] ;
			}
		}
		for(int i=0;i<m;i++) {
		if (maxvalue < b[i]) {
			maxvalue = b[i];
		}
		}
		
		for(int val =minvalue; val<=maxvalue;val++ ) {
			boolean condition1 = true;
			boolean condition2 = true;
			for(int i=0;i<n;i++  ) {
			if (val % a[i] !=0) {
				condition1 = false;
				break;
			}}
			for(int i =0; i<m ; i++) {
				if (b[i] % val != 0) {
					condition2 = false ;
					break;
				}}
				if(condition1 && condition2) {
					count++;
				}}
		
	System.out.println(count);
	sc.close();
	}
	
	}
