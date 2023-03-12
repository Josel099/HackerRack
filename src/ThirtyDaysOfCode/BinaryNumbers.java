package ThirtyDaysOfCode;

import java.util.Scanner;

public class BinaryNumbers {

  public static void main(String[] args) {
    
    Scanner sc= new Scanner(System.in);
    int [] arr = new int[100];
  
    int n= sc.nextInt();
    
    int count=0;
    for(int i=0;n!=0;i++) {
      arr[i]=n%2;
      n=n/2;
      count++;
    }
    

//     for (int i=count-1;i>=0;i--) {
//         System.out.print(arr[i]);
//     }
//    
    int k=count;
    int r=0;
    
    for(int j=0;k>0;j++){
    //  int r=0;
      int consecutiveOnes =0;
      
      
        while(k>0) {
        	k--;
        if(arr[k]==1) {
        	consecutiveOnes++;
        }
        else {
        	break;//consecutiveOnes=0;
        }
        
      }
        //finding the no. of ones
        if(consecutiveOnes>r) {
        r=	consecutiveOnes;
        }

    
  }
    sc.close();
    System.out.println(r);
}
  }
