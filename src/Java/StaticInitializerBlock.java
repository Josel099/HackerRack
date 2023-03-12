package Java;

import java.util.Scanner;

public class StaticInitializerBlock {
	   public static void main(String[] args) {

		      Scanner sc = new Scanner(System.in);
		      int B=sc.nextInt();
		      int H = sc.nextInt();
		      
		      sc.close();
		      
		      try {
		    	  if(B >0 && H > 0) 
		    		  System.out.println(B*H);
		    	  else 
		    		  throw new Exception("java.lang.Exception: Breadth and height must be positive");
		    		  
		      }
		      catch(Exception e) {
		      System.out.println(e.getMessage());
		      }
		      
}
}