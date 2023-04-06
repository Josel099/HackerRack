package Java;
import java.util.*;
import java.security.*;
public class IntToString {
 public static void main(String[] args) {

  DoNotTerminate.forbidExit();

  try {
   Scanner in = new Scanner(System.in);
   int n = in .nextInt();
   in.close();
   String s=Integer.toString(n);;

   

   
   if (n == Integer.parseInt(s)) {
    System.out.println("Good job");
   } else {
    System.out.println("Wrong answer.");
   }
  } catch (DoNotTerminate.ExitTrappedException e) {
   System.out.println("Unsuccessful Termination!!");
  }
 }
}

//The following class will prevent you from terminating the code using exit(0)!
class DoNotTerminate {

 public static class ExitTrappedException extends SecurityException {

  private static final long serialVersionUID = 1;
 }

 public static void forbidExit() {
  final SecurityManager securityManager = new SecurityManager() {
   @Override
   public void checkPermission(Permission permission) {
    if (permission.getName().contains("exitVM")) {
     throw new ExitTrappedException();
    }
   }
  };
  System.setSecurityManager(securityManager);
 }
}

































import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Birds {
    public static int lowfrequency(List<Integer> birdType) {
        Map<Integer, Integer> frequencyMap = new HashMap<>();
        int maxFrequency = 0;
        int maxBirdType = Integer.MAX_VALUE;

        // Iterate through the list of bird types and count their frequency using a Map
        for (int bird : birdType) {
            int frequency = frequencyMap.getOrDefault(bird, 0) + 1;
            frequencyMap.put(bird, frequency);

            // Update the maximum frequency and bird type if the current bird type has a higher frequency
            if (frequency > maxFrequency || (frequency == maxFrequency && bird < maxBirdType)) {
                maxFrequency = frequency;
                maxBirdType = bird;
            }
        }

        return maxBirdType;
    }
}


