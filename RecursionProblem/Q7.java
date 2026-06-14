//Tower of Hanoi

import java.util.*;

public class Q7 {
    public static void TowerOfHanoi(int n,String src,String hpr,String dest) {

        //Base-case
        if(n == 1){
            System.out.println("The ring " + n + " is moving from " + src + " to " + dest);
            return;
        }

        TowerOfHanoi(n-1,src,dest,hpr);
        System.out.println("The ring " + n + " is moving from " + src + " to " + dest);
        
        TowerOfHanoi(n-1,hpr,src,dest);

    }
 public static void main(String args[]) {
      Scanner sc = new Scanner(System.in);

      //input
      System.out.print("Enter Number of rings: ");
      int n = sc.nextInt();
      
      TowerOfHanoi(n,"S","H","D");
     
 }
}
