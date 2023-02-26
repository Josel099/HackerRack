package otherProblems;

import java.util.Scanner;

public class DiagonalDifference {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		int[][] ar = new int[100][100];
		int sumDiagonal1=0;
		int sumDiagonal2=0;
		
		int n=sc.nextInt();
		

		for(int i=0;i<n;i++) {
			
			for(int j=0;j<n;j++) {
				ar[i][j]=sc.nextInt(); 
			}
		}
	for(int i=0;i<n;i++) {
			
			for(int j=0;j<n;j++) {
				//ar[i][j]=sc.nextInt();
				//System.out.print(ar[i][j]+" ");
			}
			//System.out.println();
		}
		
	// sum of first diagonal element's
	int k =n;
	for(int i=0;i<n;i++) {
		
		sumDiagonal1=sumDiagonal1+ar[i][i];
		
	}
	//System.out.println(sumDiagonal1);
	// sum of second diagonal element's
for(int i=0;i<n;i++) {
		k--;
		sumDiagonal2=sumDiagonal2+ar[i][k];
		
	}
//System.out.println(sumDiagonal2);
	System.out.println(Math.abs(sumDiagonal1-sumDiagonal2));
	sc.close();
	}
}







