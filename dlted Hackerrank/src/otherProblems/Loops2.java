package otherProblems;

import java.util.Scanner;

public class Loops2 {
	public static void main(String []argh){
		
        Scanner sc = new Scanner(System.in);
        int q=sc.nextInt();
        for(int i=0;i<q;i++){
        	 int power =1;
        	 int result=0;
    		 int f = 0; 
            int a = sc.nextInt();
            int b = sc.nextInt();
            int n = sc.nextInt();   
           
            
        	for(int j=0;j<n;j++) {
                  
        	
        	result =result+power*b;
        	//f=power*b;
        	//int result= a;
        	System.out.print(a+result+" ");
        	power=power*2;
        
        }
        	System.out.println();
        	}
        sc.close();
    }

}
