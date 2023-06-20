package Algorithems;

import java.math.BigInteger;
import java.util.Scanner;

    class result10{
        BigInteger b;
        public  BigInteger extraLongFactorials(int n) {
            if(n==0 || n==1) {
                return  BigInteger.ONE;
            }
            BigInteger factorial = BigInteger.valueOf(n);
            factorial = factorial.multiply(extraLongFactorials(n-1));
            return factorial;
        }
   }

public class ExtraLongFactorials {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        result10 rc = new result10();
        BigInteger b =rc.extraLongFactorials(n);
        System.out.println(b);



    }



}
