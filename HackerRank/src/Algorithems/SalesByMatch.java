
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
    HashMap<Integer,Integer> freqMap = new HashMap <Integer,Integer>();
    	
    	for( int i : ar) {
    		
    		freqMap.put(i,freqMap.getOrDefault(i,0) + 1);
    		//System.out.print(array[i] + " ,");
    	}

    	//System.out.println( "pairnum : ");
    	for(int i :freqMap.values()) {
    		
    			
    			int pairNum = i/2;
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
