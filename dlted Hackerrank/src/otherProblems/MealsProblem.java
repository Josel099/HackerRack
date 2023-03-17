package otherProblems;

import java.util.Scanner;

public class MealsProblem {

	
	public static void mealsCalculation(double mealCost,int tipPrecent,int taxPrecent){
		double tip=(mealCost/100)*tipPrecent;
		double tax=(mealCost/100)*taxPrecent;
		//System.out.println(tax+"  : "+tip);
		System.out.println(Math.round(mealCost+tip+tax));
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		Scanner scan=new Scanner(System.in);
		
		double mealCost = scan.nextDouble();
		int tipPrecent = scan.nextInt();
		int taxPrecent = scan.nextInt();	
		mealsCalculation(mealCost,tipPrecent,taxPrecent);
	
		scan.close();
	}
	

}
