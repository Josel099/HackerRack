package Algorithems;


import java.util.*;

class pages {



    public static int pageCount(int n, int p) {
		

    	int frontCount = p/2;
    	int backCount = (n-p)/2;
    	
    	return Math.min(frontCount, backCount);
    	
    }

}

public class  DrawingBook  {
	
	public static void main(String[] args) {
		
	
    Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int p = sc.nextInt();

        int result = pages.pageCount(n, p);
        sc.close();
        System.out.println(result);
    }}

