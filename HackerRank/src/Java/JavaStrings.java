package Java;

import java.util.Scanner;


public class JavaStrings {
	
  public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();
        
        
        System.out.println(A.length()+B.length());
      
        int result = A.compareTo(B);
        
        if(result>0) {
        System.out.println("Yes");
        }else
        	System.out.println("NO");
        
        
        A = A.substring(0,1).toUpperCase()+A.substring(1);
        B = B.substring(0,1)+B.substring(1);
        System.out.println(A);
        
    }
}
