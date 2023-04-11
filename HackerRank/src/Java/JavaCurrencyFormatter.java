package Java;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;




public class JavaCurrencyFormatter {

	
	
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double payment = scanner.nextDouble();
        scanner.close();
        // Rs.12,324.13
         
        
        
        
        Locale usL = Locale.US;
        Locale chinaL = Locale.CHINA;
        Locale franceL = Locale.FRANCE;
        Locale indiaL = new Locale("en" , "IN");
        
        // Write your code here.
        
        NumberFormat currencyFormatterUs = NumberFormat.getCurrencyInstance(usL);
        NumberFormat currencyFormatterChina = NumberFormat.getCurrencyInstance(chinaL);
        NumberFormat currencyFormatterFrance = NumberFormat.getCurrencyInstance(franceL);
        NumberFormat currencyFormatterIndia = NumberFormat.getCurrencyInstance(indiaL);

        // Format a currency value
      
        String us = currencyFormatterUs.format(payment);
        String china = currencyFormatterChina.format(payment);
        String france = currencyFormatterFrance.format(payment);
        String india = currencyFormatterIndia.format(payment);
        


        
        System.out.println("US: " + us);
        System.out.println("India: " + india);
        System.out.println("China: " + china);
        System.out.println("France: " + france);
    }
}
