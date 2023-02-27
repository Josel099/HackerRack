package Algorithems;

import java.util.Scanner;

public class PlusMinus {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		float plus = 0;
		float minus = 0;
		float zero = 0;
		int[] arr = new int[100];
		
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		
		for(int i=0;i<n;i++) {
			
			if(arr[i]>0) {
				plus++;
			}else if(arr[i]<0) {
				minus++;
			}else {
				zero++;
			}
			
		}
		
		float pos=plus/n;
		float min=minus/n;
		float zer=zero/n;
		System.out.println(String.format("%.6f",pos) );
		System.out.println(String.format("%.6f",min));
		System.out.println(String.format("%.6f",zer ));
	
		
	}
	
}
