package ThirtyDaysOfCode;

import java.util.HashMap;
import java.util.Scanner;

 

public class DictionariesAndMaps {
	 
	public static void main(String[] args) {
		 Scanner in = new Scanner(System.in);
	        int n = in.nextInt();
	        HashMap<String, Integer> phoneBook = new HashMap<String, Integer>();
	        for(int i = 0; i < n; i++){
	            String name = in.next();
	            int phone = in.nextInt();
	            in.nextLine();
	            phoneBook.put(name,phone);
	            // Write code here
	        }
	        while(in.hasNext()){
	            String s = in.next();
	            
	            if(phoneBook.containsKey(s)) {
	            	int phoneNumber =phoneBook.get(s);
	            	System.out.println(s+"="+phoneNumber);
	            }
	            else {
	            	System.out.println("Not found");
	            }
	        }
	        in.close();
	}
	
}
