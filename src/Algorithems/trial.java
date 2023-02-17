package Algorithems;
import java.util.Scanner;
public class trial {

	public static void main(String[] args) {
	

	
		        Scanner input = new Scanner(System.in);
		        input.useDelimiter(" ");

		        System.out.print("Enter a stream of integers separated by space: ");

		        while (input.hasNextInt()) {
		            int value = input.nextInt();
		            System.out.println("Value entered: " + value);
		        }

		        input.close();
		    }

}
