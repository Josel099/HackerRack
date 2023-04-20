package Algorithems;


import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

class pages {



    public static int pageCount(int n, int p) {
		
    int frontCount =0;
    int backCount = 0;
    	//from the frond of the book 
    	for (int i = 1; i<=p; i++) {
    		frontCount++;
    	}
    	frontCount = frontCount/2;
 	
    	if(n %2 != 0) {
        	for (int i = n; i>=p ; i--) {
        	backCount++;	
        	}
    	}else {
    		
    	}

    	
    	
    	
    	
  return frontCount;
    }

}

public class  DrawingBook  {
	
	public static void main(String[] args) {
		
	
    Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int p = sc.nextInt();

        int result = pages.pageCount(n, p);

        System.out.println(result);
    }}

