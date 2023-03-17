package ThirtyDaysOfCode;
import java.util.*;


class Difference{
private int[] elements;
public int maximumDifference;

Difference(int[] a) {
    this.elements = a;
}

void computeDifference() {
    maximumDifference = 0;  // initialize instance variable
    for (int i = 0; i < elements.length - 1; i++) {
        for (int j = i + 1; j < elements.length; j++) {
            int max = Math.abs(elements[i] - elements[j]);
            if (maximumDifference < max) {
                maximumDifference = max;  // update instance variable
            }
        }
    }

	   
	   this.maximumDifference =maximumDifference;
	   

}

}
	   

public class Scope {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        sc.close();

        Difference difference = new Difference(a);

        difference.computeDifference();

        System.out.print(difference.maximumDifference);
    }
}