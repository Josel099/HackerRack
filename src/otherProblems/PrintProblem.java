package otherProblems;
import java.util.Scanner;
public class PrintProblem {

	

	
	    public static void main(String[] args) {
	    	
	    
	            Scanner sc=new Scanner(System.in);
	            System.out.println("================================");
	            for(int i=0;i<3;i++)
	            {
	                String s1=sc.next();
	                int x=sc.nextInt();
	                String formattedNumber = String.format("%03d", x);
	                System.out.printf("%-13s %4s %n",s1 ,formattedNumber);
	                
	               // System.out.println(s1 +"               " + formattedNumber);
	                
	            }
	            System.out.println("================================");

	    }
	}
	      	

	    
//	        Scanner scanner = new Scanner(System.in);
//	        while (scanner.hasNext()) {
//	            String input = scanner.nextLine();
//	            String[] parts = input.split(" ");
//	            String str = parts[0];
//	            int num = Integer.parseInt(parts[1]);
//	            System.out.printf("%-15s%03d\n", str, num);
//	        }
//	        scanner.close();
//	    }
//	}
