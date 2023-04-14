
package Algorithems;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

class Stock {

    /*
     * Complete the 'sockMerchant' function below.
     
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER n
     *  2. INTEGER_ARRAY ar
     */

    public static int sockMerchant(int n, List<Integer> ar) {
    
    	int sum = 0;
    	int [] array = new int[100];
    	
    	for( int i : ar) {
    		
    		array[i]++;
    		//System.out.print(array[i] + " ,");
    	}

    	//System.out.println( "pairnum : ");
    	for(int i =0  ;i< array.length;i++) {
    		
    			
    			int pairNum = array[i]/2;
    			//System.out.print (  pairNum +" , ");
    			sum = sum + pairNum;
    		
    			//System.out.print("sum " + sum +" , ");
    
    		}
    	
    	
    	
    	
    	
		return sum;
    }

}

public class SalesByMatch {
    public static void main(String[] args) throws IOException {
       Scanner sc = new Scanner(System.in);

        List<Integer> ar = new ArrayList<>();

        int n = sc.nextInt();
        
        for (int i = 0; i < n; i++) {
            int arItem = sc.nextInt();
            ar.add(arItem);
        }

        int result = Stock.sockMerchant(n, ar);
        System.out.println(result);
    }
}
