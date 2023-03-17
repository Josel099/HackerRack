package Algorithems;


import java.util.Scanner;

public class BirthdayCakeCandles {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		 long [] arr= new long[100000];
		int n=sc.nextInt();
		
		for(int i=0;i<n;i++) {
			 arr[i]=sc.nextLong();
			}
		long x=arr[0];
    for(int i=0;i<n;i++) {
			
			if(x<arr[i]){
				x=arr[i];
			}
			
		}
    int count=0;
    for(int i=0;i<n;i++) {
		
		if(x==arr[i]){
			count++;
		}
		
	}

    	System.out.println(count);
	}

}
