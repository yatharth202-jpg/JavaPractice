package JavaPractice.PatternProblem;
import java.util.*;

public class Q4 {
    public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);

       System.out.print("Enter n : ");        
        int n = sc.nextInt();

//for space

        for(int i = 1 ; i<=n; i++) {
       for(int j = 1 ; j <= n-i ; j++){
       System.out.print(" ");
   }

    for(int j = 1 ; j <= i ; j++){
       System.out.print("*");
   }

   for(int j = 1 ; j <= i-1 ; j++){
        System.out.print("*");
       } 

       System.out.println();
 }

 //for *
      /*   for(int i = 1 ; i<=n; i++) {
       for(int j = 1 ; j <= i ; j++){
       System.out.print("*");
   }
      for(int j = 1 ; j <= i-1 ; j++){
        System.out.print("*");
       } 
 }

System.out.println();
*/
    }
}
