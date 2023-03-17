package Algorithems;

import java.util.Scanner;

public class CompareTheTriplet {

	public static void main(String[] args) {
		
		Scanner sc =new Scanner(System.in);
		int[] result = new int [] {0,0};
		int [] a=new int[3];
		int [] b=new int[3];
		
		for(int i=0;i<3;i++) {
		
			a[i]=sc.nextInt();
		}
		for(int i=0;i<3;i++) {
			
			b[i]=sc.nextInt();
		}
		
		
		for(int i=0;i<3;i++) {
		if(a[i]>b[i]) {
			result[0]++;
		}
		else if (a[i]<b[i]) {
			result[1]++;
		}
		}
		for(int i=0;i<2;i++) {
		System.out.print(result[i]+ " ");
		}
		sc.close();
		
		
		
		
	}

}
