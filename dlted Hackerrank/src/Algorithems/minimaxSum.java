package Algorithems;

import java.util.Scanner;

public class minimaxSum {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		long totSum=0;
		long[] num=new long[5];
		long[] sum=new long[5];
		for(int i=0;i<5;i++) {
			 num[i]=sc.nextLong();
			 totSum+=num[i];
		}
		
		for (int i=0;i<5;i++) {
			sum[i]=totSum-num[i];
		}
		long x=sum[0];
		long y=sum[0];
		for(int i=0;i<5;i++) {
			
			if(x<sum[i]){
				x=sum[i];
			}
			if(y>sum[i]){
				y=sum[i];
			}
			
		}
		System.out.println(y+" "+x);
	}

}
