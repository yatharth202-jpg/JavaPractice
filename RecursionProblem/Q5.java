/* Print fibonacci series */
import java.util.*;

public class Q5 {

    public static void Fibo( int n , int a , int b) {

       //base-case
        if(n == 0) {
            return ;
        }
        
     int c = a + b ;
     System.out.print(c + ",");

     Fibo(n-1,b,c);  
    }
    public static void main(String args[]) {
      Scanner sc = new Scanner(System.in);

        //input
      System.out.print("Enter a number : ");
      int n = sc.nextInt();
      int a = 0 ;
      int b = 1 ;

      System.out.print( a +","+ b + ",");

      Fibo(n-2,a,b);

    }
}