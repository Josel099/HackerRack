package Algorithems;

import java.util.Scanner;

class Result1 {

    public static String kangaroo(int x1, int v1, int x2, int v2) {
    // Write your code here
    	int kang1 = x1+v1;
    	int kang2 = x2+v2;
    	for (int j=0 ; j<=10000 ; j++) {
    		
    		if (kang1==kang2) {
    			return "Yes";
    		}
    		
    		kang1+=v1;
    		kang2+=v2;
    		
    		
    	}
		return "No";
		

    }
}

public class NumberLineJumps {



	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int x1 = sc.nextInt();
		int v1 = sc.nextInt();
		int x2 = sc.nextInt();
		int v2 = sc.nextInt();
		 String result = Result1.kangaroo(x1,v1,x2,v2);
		System.out.println(result);
		
	}

}