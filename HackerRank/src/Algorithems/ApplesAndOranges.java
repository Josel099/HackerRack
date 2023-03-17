package Algorithems;

import java.util.*;

class Result {

     

    public static void countApplesAndOranges(int s, int t, int a, int b,int m, int n,  List<Integer> apples, List<Integer> oranges) {
    
    	int countOfApple =0;
    	int countOfOrange =0;
    	
    	// finding the applesCount
    	for (int i=0;i<m;i++) {
    		int tot = a+apples.get(i);
    		if (tot >=s && tot <=t)
    			countOfApple++;
    	}

    	// finding the OrangeCount
    	for (int i=0;i<n;i++) {
    		int tot = b+oranges.get(i);
    		if (tot >=s && tot <=t)
    			countOfOrange++;
    	}
    	System.out.println(countOfApple +"\n"+countOfOrange);
    }

}

public class ApplesAndOranges {
	public static void main(String[] args) {
		

		Scanner sc = new Scanner(System.in);
		
		int s = sc.nextInt();// starting distance of house
		int t = sc.nextInt();// ending distance of house
		int a = sc.nextInt();// location of apple tree 
		int b = sc.nextInt();// location of orange tree 
		int m = sc.nextInt();// apples count
		int n = sc.nextInt();// oranges count
		  ArrayList<Integer> apples = new ArrayList<Integer>(m);
		  ArrayList<Integer> oranges = new ArrayList<Integer>(n);
		  
		  // input apples distance from the user
		  for(int i = 0; i< m ;i++) {
			  int num = sc.nextInt();
			  apples.add(num);
		  }
		  // input oranges values from the user 
		  for(int i=0;i<n;i++) {
			  int num = sc.nextInt();
			  oranges.add(num);
		  }
		  
		  Result.countApplesAndOranges(s, t, a, b, m, n, apples, oranges);// called the method without creating the object
		  
		  sc.close();
		
	}
}
