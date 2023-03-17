package ThirtyDaysOfCode;

import java.util.Scanner;

public class Arrays {

	public static void main(String[] args) {
		
		int [] A=new int [1000];
		Scanner sc= new Scanner(System.in);
	     int N =sc.nextInt();
		for(int i=0;i<N;i++) {
			A[i]=sc.nextInt();
		}
		for(int i=N-1;i>=0;i--) {
		System.out.print(A[i]+" ");
	}
  sc.close();
}
}