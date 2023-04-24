package Java;

import java.util.Scanner;

public class EndofFile {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		int i = 1;
		while(s.hasNext()) {
			String S= s.nextLine();
			System.out.println(i +" "+ s);
			i++;
		}
s.close();
	}

}
