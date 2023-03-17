package Algorithems;

import java.util.Scanner;

public class GradingStudents {
	
	

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int n =sc.nextInt();
		int [] grades=new int[n];
		
		for (int i=0;i<n;i++) {
			grades[i]=sc.nextInt();
		}
		sc.close();
		for (int i=0;i<n;i++) {
			if (grades[i]<38) 
				System.out.println(grades[i]);
			else {
				int reminder = grades[i]%5;
				if(reminder==0 || reminder<=2) System.out.println(grades[i]);
				else  {
					if (reminder==3) 
						{
						grades[i]+=2; 
						System.out.println(grades[i]);
						}
					else {
						grades[i]+=1; 
						System.out.println(grades[i]);
					}
				}
				
			}
		}
	}
	
}

