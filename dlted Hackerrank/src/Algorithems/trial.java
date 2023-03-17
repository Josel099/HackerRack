package Algorithems;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class trial {

	public static void main(String[] args) {
	
		    List<Long> ar = new ArrayList<Long>();

		    Scanner sc = new Scanner(System.in);
		    sc.useDelimiter(" ");

		    int n = sc.nextInt();
		    long sum = 0;

		    for (int i = 0; i < n; i++) {
		      ar.add(sc.nextLong());
		      sum += ar.get(i);
		    }

		    sc.close();

		    System.out.println(sum);
		  }
		

		
		    }


