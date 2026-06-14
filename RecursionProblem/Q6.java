/* Find x^n */

import java.util.*;

public class Q6 {
    public static int CalPow(int x , int n) {

        //base-case
        if(n == 0 || x == 1 ) {
            return 1 ;
        } if(x == 0 ) {
            return 0 ;
        }
        
        //for even power
        if(n%2 == 0){
          return CalPow(x,n/2)*CalPow(x,n/2);
       }
       //for odd power
        else {
          return CalPow(x,n/2)*CalPow(x,n/2)*x;
       }
    }


    public static void main(String args[]) {
      Scanner sc = new Scanner(System.in);

      //input
      System.out.print("Enter a the base number x : ");
      int x = sc.nextInt();
      System.out.print("Enter a the power number n : ");
      int n = sc.nextInt();

      int ans = CalPow(x,n);

      //output
      System.out.print( x + " to the power " + n + " is " + ans);
    }
}
