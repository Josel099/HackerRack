package Algorithems;

import java.util.Scanner;

public class minimaxSum {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int totSum=0;
		int[] num=new int[5];
		int[] sum=new int[5];
		for(int i=0;i<5;i++) {
			 num[i]=sc.nextInt();
			 totSum+=num[i];
		}
		
		for (int i=0;i<5;i++) {
			sum[i]=totSum-num[i];
		}
		int x=sum[0];
		int y=sum[0];
		for(int i=0;i<5;i++) {
			
			if(x<sum[i]){
				x=sum[i];
			}
			if(y>sum[i]){
				y=sum[i];
			}
			
		}
		System.out.println(x+" "+y);
	}

}
