package Algorithems;
import org.javatuples.Triplet;
import java.util.*;
public class CompareTheTriplets {
	
	


	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		int[] result = new int [] {0,0};
		Triplet<Integer,Integer,Integer> a= new Triplet <>(sc.nextInt(), sc.nextInt(),sc.nextInt());
		Triplet<Integer,Integer,Integer> b= new Triplet <>(sc.nextInt(), sc.nextInt(),sc.nextInt());
		
		
	
		if(a.getValue0()>b.getValue0()) {
			result[0]++;
		}
		else if(a.getValue0()<b.getValue0()) {
			result[1]++;
		}
		
		if(a.getValue1()>b.getValue1()) {
			result[0]++;
		}

		else if(a.getValue1()<b.getValue1()) {
			result[1]++;
		}
		
		if(a.getValue2()>b.getValue2()) {
			result[0]++;
		}		else if(a.getValue2()<b.getValue2()) {
			result[1]++;
		}

		for(int i=0;i<2;i++) {
		System.out.print(result[i]+" ");
		}
		
		sc.close();
	 
		

	}

}
